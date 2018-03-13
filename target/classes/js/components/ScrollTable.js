define(function (require) {
  var $ = require('jquery');

  function ScrollTable(el, pageRowNum, autoAddNum) {
    this.$el = $(el);
    this.list = [];
    this.currentPage = 0;
    this.pageRowNum = pageRowNum || 0;
    this.autoAddNum = autoAddNum || false;
    this.timer = {};
  }

  ScrollTable.prototype.update = function (list) {
    var self = this;
    this.list = list;

    clearInterval(this.timer);
    this._renderList();
    if (this.list.length > this.pageRowNum) {
      this.timer = setInterval(function () {
        self._renderList();
      }, 5000);
    }
  };

  ScrollTable.prototype._getListStr = function () {
    var self = this;
    var from = self.currentPage * self.pageRowNum;
    var to = (self.currentPage + 1) * self.pageRowNum;

    return self.list
      .slice(from, to)
      .reduce(function (prev, item, i) {
        var str = '<li>';

        if (self.autoAddNum) {
          str += '<div>' + (self.currentPage * self.pageRowNum + i + 1) + '</div>';
        }


        for (var content in item) {
          str += '<div>' + item[content] + '</div>';
        }
        str += '</li>';
        return prev + str;
      }, '');
  };

  ScrollTable.prototype._renderList = function () {
    var str = this._getListStr();
    var $listbody = this.$el.find('.list-body');
    $listbody.empty().append(str);
    setTimeout(function () {
      $listbody.find('li').each(function (i, item) {
        setTimeout(function () {
          $(item).addClass('show')
        }, i * 150)
      })
    }, 0);

    this.currentPage = (this.currentPage + 1) % Math.ceil(this.list.length / this.pageRowNum);
  };

  return ScrollTable
});