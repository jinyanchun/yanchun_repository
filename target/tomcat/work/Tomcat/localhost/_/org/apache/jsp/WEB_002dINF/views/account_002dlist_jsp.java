/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-09 15:22:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Basic DataGrid - jQuery EasyUI Demo</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"./js/jquery-easyui-1.5.1/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"./js/jquery-easyui-1.5.1/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"./js/jquery-easyui-1.5.1/demo/demo.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"./js/jquery-easyui-1.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"./js/jquery-easyui-1.5.1/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"padding: 5px 0;\">\r\n");
      out.write("\t\t<a href=\"#\" onclick=\"add()\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\tdata-options=\"iconCls:'icon-add'\">新增</a> <a href=\"#\"\r\n");
      out.write("\t\t\tonclick=\"remove()\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\tdata-options=\"iconCls:'icon-remove'\">删除</a> <a href=\"#\"\r\n");
      out.write("\t\t\tonclick=\"edit()\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\tdata-options=\"iconCls:'icon-edit'\">修改</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table id=\"dg\" title=\"用户查询\" style=\"width: 100%; height: 100%\"\r\n");
      out.write("\t\tdata-options=\"rownumbers:true,singleSelect:false,pagination:true,url:'rest/account',method:'get'\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'accountId',width:50\">用户ID</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'accountName',width:100\">用户姓名</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'nickName',width:80,align:'right'\">用户昵称</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'password',width:100,align:'right'\">密码</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'headUrl',width:80,align:'right'\">头像</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'sex',width:50\" formatter=\"formatSex\">性别</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'isLock',width:50,align:'center'\" formatter=\"formatIsLock\">是否锁定</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'createTime',width:120,align:'center'\" formatter=\"formatDate\">创建时间</th>\r\n");
      out.write("\t\t\t\t<th data-options=\"field:'updateTime',width:120,align:'center'\" formatter=\"formatDate\">最后更新时间</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div id=\"itemEditWindow\" class=\"easyui-window\" title=\"编辑商品\"\r\n");
      out.write("\t\tdata-options=\"modal:true,closed:true,iconCls:'icon-save',href:'/rest/page/account-edit'\"\r\n");
      out.write("\t\tstyle=\"width: 50%; height: 80%; padding: 10px;\"></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t//时间格式化\r\n");
      out.write("\tDate.prototype.format = function(format){ \r\n");
      out.write("\t    var o =  { \r\n");
      out.write("\t    \"M+\" : this.getMonth()+1, //month \r\n");
      out.write("\t    \"d+\" : this.getDate(), //day \r\n");
      out.write("\t    \"h+\" : this.getHours(), //hour \r\n");
      out.write("\t    \"m+\" : this.getMinutes(), //minute \r\n");
      out.write("\t    \"s+\" : this.getSeconds(), //second \r\n");
      out.write("\t    \"q+\" : Math.floor((this.getMonth()+3)/3), //quarter \r\n");
      out.write("\t    \"S\" : this.getMilliseconds() //millisecond \r\n");
      out.write("\t    };\r\n");
      out.write("\t    if(/(y+)/.test(format)){ \r\n");
      out.write("\t    \tformat = format.replace(RegExp.$1, (this.getFullYear()+\"\").substr(4 - RegExp.$1.length)); \r\n");
      out.write("\t    }\r\n");
      out.write("\t    for(var k in o)  { \r\n");
      out.write("\t\t    if(new RegExp(\"(\"+ k +\")\").test(format)){ \r\n");
      out.write("\t\t    \tformat = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : (\"00\"+ o[k]).substr((\"\"+ o[k]).length)); \r\n");
      out.write("\t\t    } \r\n");
      out.write("\t    } \r\n");
      out.write("\t    return format; \r\n");
      out.write("\t};\r\n");
      out.write("\t//格式化时间\r\n");
      out.write("\tfunction formatDate(value,row){\r\n");
      out.write("\t\tvar now = new Date(value);\r\n");
      out.write("    \treturn now.format(\"yyyy-MM-dd hh:mm:ss\");\r\n");
      out.write("\t}\r\n");
      out.write("\t//是否锁定(0否，1是)\r\n");
      out.write("\tfunction formatIsLock(value,row){\r\n");
      out.write("\t\tvar islock = \"\";\r\n");
      out.write("\t\tif(value == 0){\r\n");
      out.write("\t\t\tislock = \"否\";\r\n");
      out.write("\t\t}else if(value == 1){\r\n");
      out.write("\t\t\tislock = \"是\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tislock =\"未填写\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn islock;\r\n");
      out.write("\t}\r\n");
      out.write("\t//格式化性别（0未知，1男，2女）\r\n");
      out.write("\t\tfunction formatSex(value,row){\r\n");
      out.write("\t\tvar sex = \"\";\r\n");
      out.write("\t\t\tif(value == 1){\r\n");
      out.write("\t\t\t\tsex = \"男\";\r\n");
      out.write("\t\t\t}else if(value == 2){\r\n");
      out.write("\t\t\t\tsex = \"女\";\r\n");
      out.write("\t\t\t}else if(value == 0){\r\n");
      out.write("\t\t\t\tsex = \"未知\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tsex = \"未填写\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn sex;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//新增事件调用\r\n");
      out.write("\t\tfunction add() {\r\n");
      out.write("\t\t\t// 去上级目录中找新增用户按钮\r\n");
      out.write("\t\t\t$(\".tree-title:contains('新增用户')\").parent().click();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//修改事件调用\r\n");
      out.write("\t\tfunction edit() {\r\n");
      out.write("\t\t\tvar ids = getSelectionsIds();\r\n");
      out.write("\t\t\tif (ids.length == 0) {\r\n");
      out.write("\t\t\t\t$.messager.alert('提示', '必须选择一个商品才能编辑!');\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (ids.indexOf(',') > 0) {\r\n");
      out.write("\t\t\t\t$.messager.alert('提示', '只能选择一个商品!');\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#itemEditWindow\").window({\r\n");
      out.write("\t\t\t\tonLoad :function(){\r\n");
      out.write("\t\t\t\t\t$(\"#accountEditForm\").form(\"load\",\"/rest/account/getAccount?id=\"+ids);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}).window(\"open\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t// 刷新表格\r\n");
      out.write("\t\tfunction reflush(){\r\n");
      out.write("\t\t\t//刷新页面\r\n");
      out.write("\t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t// 删除事件调用\r\n");
      out.write("\t\tfunction remove() {\r\n");
      out.write("\t\t\tvar ids = getSelectionsIds();\r\n");
      out.write("\t\t\tif (ids.length == 0) {\r\n");
      out.write("\t\t\t\t$.messager.alert('提示', '未选择用户！');\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.messager.confirm('确认', '确定删除ID为 ' + ids + ' 的用户所有信息吗？', function(\r\n");
      out.write("\t\t\t\t\tr) {\r\n");
      out.write("\t\t\t\tif (r) {\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\turl : \"/rest/account/delete\",\r\n");
      out.write("\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\"ids\" : ids,\r\n");
      out.write("\t\t\t\t\t\t\t\"_method\" : \"DELETE\"\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tstatusCode : {\r\n");
      out.write("\t\t\t\t\t\t\t200 : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#dg\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('提示', '删除用户成功!!');\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t500 : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$.messager.alert('提示', '删除用户失败!');\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvar pager = $('#dg').datagrid().datagrid('getPager');\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t//获取选中的ID长度\r\n");
      out.write("\t\tfunction getSelectionsIds() {\r\n");
      out.write("\t\t\tvar accountList = $(\"#dg\");\r\n");
      out.write("\t\t\tvar sels = accountList.datagrid(\"getSelections\");\r\n");
      out.write("\t\t\tvar ids = [];\r\n");
      out.write("\t\t\tfor ( var i in sels) {\r\n");
      out.write("\t\t\t\tids.push(sels[i].accountId);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tids = ids.join(\",\");\r\n");
      out.write("\t\t\treturn ids;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
