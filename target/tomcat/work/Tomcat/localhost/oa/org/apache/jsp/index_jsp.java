/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-10 15:31:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Complex Layout - jQuery EasyUI Demo</title>\r\n");
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
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<div id=\"rightsAddWindow\" class=\"easyui-window\" title=\"新增权限\"\r\n");
      out.write("\t\tdata-options=\"modal:true,closed:true,iconCls:'icon-save',href:'/rest/page/account-edit'\"\r\n");
      out.write("\t\tstyle=\"width: 50%; height: 80%; padding: 10px;\"></div>\r\n");
      out.write("\t<div data-options=\"region:'north',border:false\"\r\n");
      out.write("\t\tstyle=\"height: 60px; background: #B3DFDA; padding: 10px\">\r\n");
      out.write("\t\t<h1 align=\"center\">OA后台管理系统</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'west',split:true\" title=\"West\"\r\n");
      out.write("\t\tstyle=\"width: 200px;\">\r\n");
      out.write("\t\t<div class=\"easyui-accordion\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t\t\t<div title=\"菜单\" style=\"padding: 10px;\" data-options=\"selected:true\">\r\n");
      out.write("\t\t\t\t<ul id=\"menu\" class=\"easyui-tree\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-top: 10px; margin-left: 5px;\">\r\n");
      out.write("\t\t\t\t\t<li><span>用户管理</span>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-options=\"iconCls:'icon-add',attributes:{'url':'/rest/page/account-addd'}\" >新增用户</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-options=\"iconCls:'icon-search',attributes:{'url':'/rest/page/account-list'}\">查询用户</li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><span>权限管理</span>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-options=\"iconCls:'icon-add',attributes:{'url':'/rest/page/rights-add'}\">新增权限</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-options=\"iconCls:'icon-search',attributes:{'url':'/rest/page/account-list'}\">所有权限</li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div title=\"Title2\" data-options=\"selected:true\"\r\n");
      out.write("\t\t\t\tstyle=\"padding: 10px;\">content2</div>\r\n");
      out.write("\t\t\t<div title=\"Title3\" style=\"padding: 10px\">content3</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tdata-options=\"region:'east',split:true,collapsed:true,title:'East'\"\r\n");
      out.write("\t\tstyle=\"width: 100px; padding: 10px;\">east region</div>\r\n");
      out.write("\t<div data-options=\"region:'south',border:false\"\r\n");
      out.write("\t\tstyle=\"height: 50px; background: #A9FACD; padding: 10px;\">south\r\n");
      out.write("\t\tregion</div>\r\n");
      out.write("\t<div id=\"tabs\" class=\"easyui-tabs\"\r\n");
      out.write("\t\tdata-options=\"region:'center',title:'Center'\"\r\n");
      out.write("\t\tstyle=\"width: 100%; height: 100%\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\talert(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//为树的每个节点绑定点击事件\r\n");
      out.write("\t\t$('#menu').tree({\r\n");
      out.write("\t\t\t// node是点击的节点对象\r\n");
      out.write("\t\t\tonClick : function(node) {\r\n");
      out.write("\t\t\t\t//判断点击的节点是否是叶子节点\r\n");
      out.write("\t\t\t\tif ($('#menu').tree(\"isLeaf\", node.target)) {\r\n");
      out.write("\t\t\t\t\tvar tabs = $(\"#tabs\");\r\n");
      out.write("\t\t\t\t\t//判断当前节点是否已经被打开过\r\n");
      out.write("\t\t\t\t\tvar tab = tabs.tabs(\"getTab\", node.text);\r\n");
      out.write("\t\t\t\t\tif (tab) {\r\n");
      out.write("\t\t\t\t\t\t//如果已经打开，选中它\r\n");
      out.write("\t\t\t\t\t\ttabs.tabs(\"select\", node.text);\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t//没有打开，重新打开一个页面\r\n");
      out.write("\t\t\t\t\t\ttabs.tabs('add', {\r\n");
      out.write("\t\t\t\t\t\t\ttitle : node.text,\r\n");
      out.write("\t\t\t\t\t\t\thref : node.attributes.url,\r\n");
      out.write("\t\t\t\t\t\t\tclosable : true,\r\n");
      out.write("\t\t\t\t\t\t\tbodyCls : \"content\"\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction rightsAdd() {\r\n");
      out.write("\t\t$(\"#rightsAddWindow\").window({\r\n");
      out.write("\t\t\tonLoad : function() {\r\n");
      out.write("\t\t\t\t$(\"#accountEditForm\").form(\"load\",\"/rest/page/account-edit\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).window(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
