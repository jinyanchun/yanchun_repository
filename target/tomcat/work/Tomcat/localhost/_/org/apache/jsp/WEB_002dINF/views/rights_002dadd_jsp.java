/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-11 09:54:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rights_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Load Form Data - jQuery EasyUI Demo</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./js/jquery-easyui-1.5.1/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./js/jquery-easyui-1.5.1/themes/icon.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"./js/jquery-easyui-1.5.1/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"./js/jquery-easyui-1.5.1/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"easyui-panel\" style=\"width:400px\">\r\n");
      out.write("\t\t<div style=\"padding:10px 60px 20px 60px\">\r\n");
      out.write("\t    <form id=\"rightAddForm\" method=\"post\" >\r\n");
      out.write("\t    \t<table cellpadding=\"5\">\r\n");
      out.write("\t    \t\t<tr>\r\n");
      out.write("\t    \t\t\t<td>权限名称:</td>\r\n");
      out.write("\t    \t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"rightName\" data-options=\"required:true\"></input></td>\r\n");
      out.write("\t    \t\t</tr>\r\n");
      out.write("\t    \t\t<tr>\r\n");
      out.write("\t    \t\t\t<td>权限地址:</td>\r\n");
      out.write("\t    \t\t\t<td><input class=\"easyui-textbox\" type=\"text\" name=\"rightSite\" data-options=\"required:true,validType:'email'\"></input></td>\r\n");
      out.write("\t    \t\t</tr>\r\n");
      out.write("\t    \t\t<tr>\r\n");
      out.write("\t    \t\t\t<td>权限类型:</td>\r\n");
      out.write("\t    \t\t\t<td>\r\n");
      out.write("\t\t    \t\t\t<select id=\"typeId\" name=\"type\" style=\"width: 100px\">\r\n");
      out.write("\t\t\t    \t\t\t<option value=\"0\">菜单</option>\r\n");
      out.write("\t\t\t    \t\t\t<option value=\"1\">按钮</option>\r\n");
      out.write("\t\t    \t\t\t</select>\r\n");
      out.write("\t    \t\t\t</td>\r\n");
      out.write("\t    \t\t</tr>\r\n");
      out.write("\t    \t\t<tr>\r\n");
      out.write("\t    \t\t\t<td>上级权限:</td>\r\n");
      out.write("\t\t            <td>\r\n");
      out.write("\t            \t\t<ul id=\"functionTree\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t    \t\t</td>\r\n");
      out.write("\t    \t\t</tr>\r\n");
      out.write("\t    \t\t<tr>\r\n");
      out.write("\t\t            <td>是否锁定:</td>\r\n");
      out.write("\t\t            <td>\r\n");
      out.write("\t\t\t    \t\t<input type=\"radio\" name=\"islock\" value=\"1\">是\r\n");
      out.write("\t\t\t    \t\t<input type=\"radio\" name=\"islock\" value=\"0\">否\r\n");
      out.write("\t\t    \t\t</td>\r\n");
      out.write("\t        \t</tr>\r\n");
      out.write("\t    \t</table>\r\n");
      out.write("\t    </form>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"padding:5px\">\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitForm()\">提交</a>\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"clearForm()\">重置</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t// 授权树初始化\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tkey : {\r\n");
      out.write("\t\t\t\t\ttitle : \"t\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsimpleData : {\r\n");
      out.write("\t\t\t\t\tenable : true\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcheck : {\r\n");
      out.write("\t\t\t\tenable : true,\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/json/menu.json',\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tvar zNodes = eval(\"(\" + data + \")\");\r\n");
      out.write("\t\t\t\t$.fn.zTree.init($(\"#functionTree\"), setting, zNodes);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(msg) {\r\n");
      out.write("\t\t\t\talert('树加载异常!');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 点击保存\r\n");
      out.write("\t\t$('#save').click(function(){\r\n");
      out.write("\t\t\tlocation.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/page_admin_privilege.action';\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("// \t++++++++++++++++++++++++++++++\r\n");
      out.write("// \t++++++++++++++++++++++++++++++\r\n");
      out.write("// \t++++++++++++++++++++++++++++++\r\n");
      out.write("// \t++++++++++++++++++++++++++++++\r\n");
      out.write("function submitForm(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//  提交到后台的RESTful\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t   type: \"POST\",\r\n");
      out.write("\t\t   url: \"/rest/right\",\r\n");
      out.write("\t\t   data: $(\"#rightAddForm\").serialize(),\r\n");
      out.write("\t\t   statusCode : {\r\n");
      out.write("\t\t\t   201 : function(){\r\n");
      out.write("\t\t\t\t   $.messager.alert('提示','新增权限成功!');\r\n");
      out.write("\t\t\t   },\r\n");
      out.write("\t\t\t   400 : function(){\r\n");
      out.write("\t\t\t\t   $.messager.alert('提示','参数有误!');\r\n");
      out.write("\t\t\t   },\r\n");
      out.write("\t\t\t   500 : function(){\r\n");
      out.write("\t\t\t\t   $.messager.alert('提示','新增权限失败!');\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clearForm(){\r\n");
      out.write("\t\t$('#rightAddForm').form('reset');\r\n");
      out.write("\t}\r\n");
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
