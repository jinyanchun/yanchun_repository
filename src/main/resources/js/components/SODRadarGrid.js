define(function (require) {
  "use strict";

  var d3 = require('d3');

  function SODRadarGrid(option) {
    this.width = option.width || 0;
    this.height = option.height || 0;

    this.top = option.top || 0;
    this.bottom = option.bottom || 0;
    this.left = option.left || 0;
    this.right = option.right || 0;

    this.xAxisData = option.xAxisData || [];

    this.dataSet = [];
    this.chart = d3.select(option.el)
      .append('svg')
      .attr('height', this.height)
      .attr('width', this.width);

    this._init();
  }

  SODRadarGrid.prototype._init = function () {
    this._drawXAxix();
    this._drawYAxix();
  };

  SODRadarGrid.prototype._XAxisScale = function () {
    // utc时间
    return d3.scaleBand()
      .paddingInner(0.15)
      .paddingOuter(0)
      .domain((function () {
        var arr = [];
        for (var i = 0; i < 24 * 10; i++) {
          arr.push(i)
        }
        return arr;
      })())
      .range([0, this.width - this.left - this.right])
  };
  SODRadarGrid.prototype._XAxisScale1 = function () {
    // utc时间
    return d3.scaleBand()
      .paddingInner(0.15)
      .paddingOuter(0)
      .domain(this.xAxisData)
      .range([0, this.width - this.left - this.right])
  };
  SODRadarGrid.prototype._YAxisScale = function () {
    // 类目轴
    var yAxisTicks = d3.map(this.dataSet, function (d) {
      return d.id;
    }).keys();
    debugger
    return d3.scaleBand()
      .paddingInner(0.3)
      .paddingOuter(0)
      .domain(yAxisTicks)
      .range([0, this.height - this.top - this.bottom]);
  };

  SODRadarGrid.prototype._drawXAxix = function () {
    this.chart
      .append('g')
      .attr('class', 'xAxis')
      .attr('transform', 'translate(' + this.left + ',' + (this.height - this.bottom) + ')')
      .call(d3.axisBottom(this._XAxisScale1()));
  };
  SODRadarGrid.prototype._drawYAxix = function () {
    this.chart
      .append('g')
      .attr('class', 'yAxis')
      .attr('transform', 'translate(' + (this.left - 10) + ',' + this.top + ')')
      .call(d3.axisLeft(this._YAxisScale()));
  };

  SODRadarGrid.prototype._renderRect = function (selection) {
    var XAxisScale = this._XAxisScale();
    var YAxisScale = this._YAxisScale();
    return selection
      .attr('width', XAxisScale.bandwidth())
      .attr('height', function () {
        return YAxisScale.bandwidth();
      })
      .attr('fill', function (d, i) {
        if (d.state === 1) {
          return i === 1 ? 'rgba(255,255,255,0.3)' : 'rgba(255,255,255,0.5)';
        }
        if (d.state === 2) {
          return '#ff7900';
        }

        return i === 1 ? '#15a4ff' : '#005eb6';
      })
  };
  SODRadarGrid.prototype._renderText = function (selection) {
    var XAxisScale = this._XAxisScale();
    var YAxisScale = this._YAxisScale();

    return selection
      .text(function (d) {
        if (d.state === 2) {
          return d.ratio;
        }
        return '';
      })
      .attr('fill', '#fff')
      .attr('x', XAxisScale.bandwidth() / 2)
      .attr('y', YAxisScale.bandwidth() * 0.5)
      .attr('dy', '0.3em')
      .attr('text-anchor', 'middle')
      .attr('font-size', 14)
  };

  SODRadarGrid.prototype._enter = function (selections) {
    var self = this;
    var XAxisScale = this._XAxisScale();
    var YAxisScale = this._YAxisScale();

    var gEnter = selections
      .append('g')
      .attr('class', 'rectWrapper')
      .attr('transform', function (d) {
        debugger
        return 'translate(' + (self.left + XAxisScale(d.time)) + ',' + (self.top + YAxisScale(d.id)) + ')'
      });

    gEnter
      .selectAll('rect')
      .data(function (d) {
        return d.child
      })
      .enter()
      .append('rect')
      .call(this._renderRect.bind(this));

    // gEnter
    //   .selectAll('text')
    //   .data(function (d) {
    //     return d.child
    //   })
    //   .enter()
    //   .append('text')
    //   .call(this._renderText.bind(this));
  };
  SODRadarGrid.prototype._update = function (selections) {
    var self = this;
    var XAxisScale = this._XAxisScale();
    var YAxisScale = this._YAxisScale();

    selections
      .attr('transform', function (d) {
        return 'translate(' + (self.left + XAxisScale(d.time)) + ',' + (self.top + YAxisScale(d.id)) + ')'
      });

    //画矩形
    selections
      .selectAll('rect')
      .data(function (d) {
        return d.child
      })
      .call(this._renderRect.bind(this));
    //写文字
    // selections
    //   .selectAll('text')
    //   .data(function (d) {
    //     return d.child
    //   })
    //   .call(this._renderText.bind(this))
  };
  SODRadarGrid.prototype._exit = function (selections) {
    selections.remove()
  };

  SODRadarGrid.prototype.update = function (data) {
    this.dataSet = data;

    this.chart
      .selectAll('.yAxis')
      .call(d3.axisLeft(this._YAxisScale()));

    var boxes = this.chart
      .selectAll('.rectWrapper')
      .data(this.dataSet);
    var boxesEnter = boxes.enter();
    var boxesExit = boxes.exit();

    // 进入
    this._enter(boxesEnter);

    // 更新
    this._update(boxes);

    // 退出
    this._exit(boxesExit)

  };

  return SODRadarGrid;
})