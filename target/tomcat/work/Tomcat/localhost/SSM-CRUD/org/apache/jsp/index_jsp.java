/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-25 13:58:57 UTC
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    ");

        pageContext.setAttribute("APP_PATH", request.getContextPath());
    
      out.write("\r\n");
      out.write("    <title>员工列表</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/css/bootstrap.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 员工修改的模态框 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"empUpdateModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("     aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\r\n");
      out.write("                        aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\">员工修改</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">empName</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <p class=\"form-control-static\" id=\"empName_update_static\"></p>\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">email</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\"\r\n");
      out.write("                                   id=\"email_update_input\"\r\n");
      out.write("                                   placeholder=\"email@qq.com\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">gender</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"gender1_update_input\"\r\n");
      out.write("                                       value=\"M\" checked=\"checked\"> 男\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\"\r\n");
      out.write("                                       value=\"F\"> 女\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">deptName</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <select class=\"form-control\" name=\"dId\" id=\"dept_add_select\">\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"emp_update_btn\">修改</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 员工添加的模态框 -->\r\n");
      out.write("<div class=\"modal fade\" id=\"empAddModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\r\n");
      out.write("                        aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">员工添加</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">empName</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"empName\" class=\"form-control\"\r\n");
      out.write("                                   id=\"empName_add_input\"\r\n");
      out.write("                                   placeholder=\"empName\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">email</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\"\r\n");
      out.write("                                   id=\"email_add_input\"\r\n");
      out.write("                                   placeholder=\"email@qq.com\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">gender</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"gender1_add_input\"\r\n");
      out.write("                                       value=\"M\" checked=\"checked\"> 男\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"inlineRadio2\"\r\n");
      out.write("                                       value=\"F\"> 女\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label class=\"col-sm-2 control-label\">deptName</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <select class=\"form-control\" name=\"dId\" id=\"dept_add_select\">\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"emp_save_btn\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <h1>SSM-CRUD</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4 col-md-offset-8\">\r\n");
      out.write("            <button class=\"btn btn-primary\" id=\"emp_add_modal_btn\">新增</button>\r\n");
      out.write("            <button class=\"btn btn-danger\" id=\"emp_deleteAll_btn\">删除</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <table class=\"table table-hover\" id=\"emps_table\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th><input type=\"checkbox\" id=\"check_all\"/>\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>员工编号</th>\r\n");
      out.write("                    <th>员工姓名</th>\r\n");
      out.write("                    <th>员工性别</th>\r\n");
      out.write("                    <th>员工邮件</th>\r\n");
      out.write("                    <th>员工部门</th>\r\n");
      out.write("                    <th>操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"col-md-6\" id=\"page_info_area\">\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"col-md-6\" id=\"page_nave_area\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  var currentPage;\r\n");
      out.write("  $(function () {\r\n");
      out.write("    to_page(1);\r\n");
      out.write("  })\r\n");
      out.write("\r\n");
      out.write("  function to_page(pn) {\r\n");
      out.write("    $.ajax({\r\n");
      out.write("      url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emps\",\r\n");
      out.write("      data: \"pn=\" + pn,\r\n");
      out.write("      type: \"GET\",\r\n");
      out.write("      success: function (result) {\r\n");
      out.write("        // 解析json并显示员工数据\r\n");
      out.write("        build_emps_table(result);\r\n");
      out.write("        // 解析json并显示分页信息\r\n");
      out.write("        build_page_info(result);\r\n");
      out.write("        build_page_nav(result);\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function build_emps_table(result) {\r\n");
      out.write("    $(\"#emps_table tbody\").empty();\r\n");
      out.write("    var emps = result.extend.pageInfo.list;\r\n");
      out.write("    $.each(emps, function (index, item) {\r\n");
      out.write("      var checkBoxTd = $(\"<td><input type='checkbox' class='check_item'/></td>\");\r\n");
      out.write("      var empIdTd = $(\"<td></td>\").append(item.empId);\r\n");
      out.write("      var empNameTd = $(\"<td></td>\").append(item.empName);\r\n");
      out.write("      var genderTd = $(\"<td></td>\").append(item.gender == 'M' ? \"男\" : \"女\");\r\n");
      out.write("      var emailTd = $(\"<td></td>\").append(item.email);\r\n");
      out.write("      var deptNameTd = $(\"<td></td>\").append(item.department.deptName);\r\n");
      out.write("      var editBtn = $(\"<button></button>\").addClass(\"btn btn-primary btn-sm edit_btn\").append(\r\n");
      out.write("          $(\"<span></apan>\").addClass(\"glyphicon glyphicon-pencil\")).append(\"编辑\");\r\n");
      out.write("      // 为编辑按钮添加一个自定义属性，来表示当前员工id\r\n");
      out.write("      editBtn.attr(\"edit-id\", item.empId);\r\n");
      out.write("      var delBtn = $(\"<button></button>\").addClass(\"btn btn-danger btn-sm delete_btn\").append(\r\n");
      out.write("          $(\"<span></apan>\").addClass(\"glyphicon glyphicon-trash\")).append(\"删除\");\r\n");
      out.write("      // 为删除按钮添加一个自定义属性，来表示当前员工id\r\n");
      out.write("      delBtn.attr(\"del-id\", item.empId);\r\n");
      out.write("      var btnTd = $(\"<td></td>\").append(editBtn).append(\" \").append(delBtn);\r\n");
      out.write("      $(\"<tr></tr>\").append(checkBoxTd)\r\n");
      out.write("      .append(empIdTd)\r\n");
      out.write("      .append(empNameTd)\r\n");
      out.write("      .append(genderTd)\r\n");
      out.write("      .append(emailTd)\r\n");
      out.write("      .append(deptNameTd)\r\n");
      out.write("      .append(btnTd)\r\n");
      out.write("      .appendTo(\"#emps_table tbody\");\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // 解析显示分页信息\r\n");
      out.write("  function build_page_info(result) {\r\n");
      out.write("    $(\"#page_info_area\").empty();\r\n");
      out.write("    $(\"#page_info_area\").append(\"当前\"\r\n");
      out.write("        + result.extend.pageInfo.pageNum\r\n");
      out.write("        + \"页,总共\" + result.extend.pageInfo.pages\r\n");
      out.write("        + \"页,总\" + result.extend.pageInfo.total\r\n");
      out.write("        + \"条记录\"\r\n");
      out.write("    );\r\n");
      out.write("    currentPage = result.extend.pageInfo.pageNum;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // 解析显示分页条\r\n");
      out.write("  function build_page_nav(result) {\r\n");
      out.write("    $(\"#page_nave_area\").empty();\r\n");
      out.write("    var ul = $(\"<ul></ul>\").addClass(\"pagination\");\r\n");
      out.write("    var firstPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"首页\")).attr(\"href\", \"#\");\r\n");
      out.write("    var prePageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&laquo;\"));\r\n");
      out.write("    if (result.extend.pageInfo.hasPreviousPage == false) {\r\n");
      out.write("      firstPageLi.addClass(\"disabled\");\r\n");
      out.write("      prePageLi.addClass(\"disabled\");\r\n");
      out.write("    } else {\r\n");
      out.write("      firstPageLi.click(function () {\r\n");
      out.write("        to_page(1);\r\n");
      out.write("      });\r\n");
      out.write("      prePageLi.click(function () {\r\n");
      out.write("        to_page(result.extend.pageInfo.pageNum - 1);\r\n");
      out.write("      });\r\n");
      out.write("    }\r\n");
      out.write("    var nextPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&raquo;\"));\r\n");
      out.write("    var lastPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"末页\")).attr(\"href\", \"#\");\r\n");
      out.write("    if (result.extend.pageInfo.hasNextPage == false) {\r\n");
      out.write("      nextPageLi.addClass(\"disabled\");\r\n");
      out.write("      lastPageLi.addClass(\"disabled\");\r\n");
      out.write("    } else {\r\n");
      out.write("      lastPageLi.click(function () {\r\n");
      out.write("        to_page(result.extend.pageInfo.pages);\r\n");
      out.write("      });\r\n");
      out.write("      nextPageLi.click(function () {\r\n");
      out.write("        to_page(result.extend.pageInfo.pageNum + 1);\r\n");
      out.write("      });\r\n");
      out.write("    }\r\n");
      out.write("    ul.append(firstPageLi).append(prePageLi);\r\n");
      out.write("    $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {\r\n");
      out.write("      var numLi = $(\"<li></li>\").append($(\"<a></a>\").append(item));\r\n");
      out.write("      if (result.extend.pageInfo.pageNum == item) {\r\n");
      out.write("        numLi.addClass(\"active\");\r\n");
      out.write("      }\r\n");
      out.write("      numLi.click(function () {\r\n");
      out.write("        to_page(item);\r\n");
      out.write("      });\r\n");
      out.write("      ul.append(numLi);\r\n");
      out.write("    });\r\n");
      out.write("    ul.append(nextPageLi).append(lastPageLi);\r\n");
      out.write("    var navEle = $(\"<nav></nav>\").append(ul);\r\n");
      out.write("    navEle.appendTo(\"#page_nave_area\");\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function reset_form(ele) {\r\n");
      out.write("    $(ele)[0].reset();\r\n");
      out.write("    $(ele).find(\"*\").removeClass(\"has-success has-error\");\r\n");
      out.write("    $(ele).find(\".help-block\").text(\"\");\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // 点击新增按钮弹出模态框\r\n");
      out.write("  $(\"#emp_add_modal_btn\").click(function () {\r\n");
      out.write("    // 清除表单数据（表单重置）\r\n");
      out.write("    reset_form(\"#empAddModal form\");\r\n");
      out.write("    // 发送ajax请求，查出部门信息，显示在下拉列表中\r\n");
      out.write("    getDepts(\"#empAddModal select\");\r\n");
      out.write("    // 弹出模态框\r\n");
      out.write("    $(\"#empAddModal\").modal({\r\n");
      out.write("      backdrop: \"static\"\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  // 查出所有的部门信息并显示在下拉列表中\r\n");
      out.write("  function getDepts(ele) {\r\n");
      out.write("    $(ele).empty();\r\n");
      out.write("    $.ajax({\r\n");
      out.write("      url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/depts\",\r\n");
      out.write("      type: \"get\",\r\n");
      out.write("      success: function (result) {\r\n");
      out.write("        // console.log(result);\r\n");
      out.write("        $.each(result.extend.depts, function () {\r\n");
      out.write("          var optionEle = $(\"<option ></option>\").append(this.deptName).attr(\"value\", this.deptId);\r\n");
      out.write("          optionEle.appendTo(ele);\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function validate_add_form() {\r\n");
      out.write("    // 拿到数据，用正则表达式\r\n");
      out.write("    var empName = $(\"#empName_add_input\").val();\r\n");
      out.write("    var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})/;\r\n");
      out.write("    // 校验人名\r\n");
      out.write("    if (!regName.test(empName)) {\r\n");
      out.write("      show_validate_msg(\"#empName_add_input\", \"error\",\r\n");
      out.write("          \"名字必须是2-5个中文或者6-16位英文数字组合\");\r\n");
      out.write("      return false;\r\n");
      out.write("    } else {\r\n");
      out.write("      show_validate_msg(\"#empName_add_input\", \"success\", \"\");\r\n");
      out.write("    }\r\n");
      out.write("    ;\r\n");
      out.write("    // 校验邮箱\r\n");
      out.write("    var email = $(\"#email_add_input\").val();\r\n");
      out.write("    var regEmail = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\r\n");
      out.write("    if (!regEmail.test(email)) {\r\n");
      out.write("      show_validate_msg(\"#email_add_input\", \"error\", \"邮箱格式输入错误\");\r\n");
      out.write("      return false;\r\n");
      out.write("    } else {\r\n");
      out.write("      show_validate_msg(\"#email_add_input\", \"success\", \"\");\r\n");
      out.write("    }\r\n");
      out.write("    ;\r\n");
      out.write("    return true;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // 显示校验提示信息\r\n");
      out.write("  function show_validate_msg(ele, status, msg) {\r\n");
      out.write("    $(ele).parent().removeClass(\"has-success has-error\");\r\n");
      out.write("    $(ele).next(\"span\").text(\"\");\r\n");
      out.write("    if (\"success\" == status) {\r\n");
      out.write("      $(ele).parent().addClass(\"has-success\");\r\n");
      out.write("    } else if (\"error\" == status) {\r\n");
      out.write("      $(ele).parent().addClass(\"has-error\");\r\n");
      out.write("    }\r\n");
      out.write("    $(ele).next(\"span\").text(msg);\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  $(\"#emp_save_btn\").click(function () {\r\n");
      out.write("    // 校验数据\r\n");
      out.write("    if (!validate_add_form()) {\r\n");
      out.write("      return false;\r\n");
      out.write("    }\r\n");
      out.write("    if ($(this).attr(\"ajax-va\") == \"error\") {\r\n");
      out.write("      return false;\r\n");
      out.write("    }\r\n");
      out.write("    // 校验用户名是否可用\r\n");
      out.write("    // 模态框中填写的表单数据提交给服务器进行保存\r\n");
      out.write("    $.ajax({\r\n");
      out.write("      url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp\",\r\n");
      out.write("      type: \"POST\",\r\n");
      out.write("      data: $(\"#empAddModal form\").serialize(),\r\n");
      out.write("      success: function (result) {\r\n");
      out.write("        if (result.code == 100) {\r\n");
      out.write("          // 员工保存成功之后\r\n");
      out.write("          // 1.关闭模态框\r\n");
      out.write("          $(\"#empAddModal\").modal('hide');\r\n");
      out.write("          // 2.到最后一页，显示保存的数据\r\n");
      out.write("          to_page(999);\r\n");
      out.write("        } else {\r\n");
      out.write("          // 显示失败信息\r\n");
      out.write("          if (undefined != result.extend.errorFields.email) {\r\n");
      out.write("            show_validate_msg(\"#email_add_input\", \"error\", result.extend.errorFields.email);\r\n");
      out.write("          }\r\n");
      out.write("          if (undefined != result.extend.errorFields.empName) {\r\n");
      out.write("            show_validate_msg(\"#empName_add_input\", \"error\", result.extend.errorFields.empName);\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("  // 发送ajax请求用户名是否可用\r\n");
      out.write("  $(\"#empName_add_input\").change(function () {\r\n");
      out.write("    var empName = this.value;\r\n");
      out.write("    $.ajax({\r\n");
      out.write("      url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkUser\",\r\n");
      out.write("      data: \"empName=\" + empName,\r\n");
      out.write("      type: \"POST\",\r\n");
      out.write("      success: function (result) {\r\n");
      out.write("        if (result.code == 100) {\r\n");
      out.write("          show_validate_msg(\"#empName_add_input\", \"success\", \"用户名可用\");\r\n");
      out.write("          $(\"#emp_save_btn\").attr(\"ajax-va\", \"success\");\r\n");
      out.write("        } else {\r\n");
      out.write("          show_validate_msg(\"#empName_add_input\", \"error\", result.extend.va_msg);\r\n");
      out.write("          $(\"#emp_save_btn\").attr(\"ajax-va\", \"error\");\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    })\r\n");
      out.write("  });\r\n");
      out.write("  // 按钮创建之前就绑定click，所有绑定无效\r\n");
      out.write("  $(document).on(\"click\", \".edit_btn\", function () {\r\n");
      out.write("    // alert(\"edit\");\r\n");
      out.write("    // 回显全部部门\r\n");
      out.write("    getDepts(\"#empUpdateModal select\");\r\n");
      out.write("    // 查询员工信息\r\n");
      out.write("    getEmp($(this).attr(\"edit-id\"));\r\n");
      out.write("    // 把员工的id传给更新按钮\r\n");
      out.write("    $(\"#emp_update_btn\").attr(\"edit-id\", $(this).attr(\"edit-id\"));\r\n");
      out.write("    $(\"#empUpdateModal\").modal({\r\n");
      out.write("      backdrop: \"static\"\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("  function getEmp(id) {\r\n");
      out.write("    $.ajax({\r\n");
      out.write("      url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\" + id,\r\n");
      out.write("      type: \"GET\",\r\n");
      out.write("      success: function (result) {\r\n");
      out.write("        // console.log(result);\r\n");
      out.write("        var empData = result.extend.emp;\r\n");
      out.write("        $(\"#empName_update_static\").text(empData.empName);\r\n");
      out.write("        $(\"#email_update_input\").val(empData.email);\r\n");
      out.write("        $(\"#empUpdateModal input[name=gender]\").val([empData.gender]);\r\n");
      out.write("        $(\"#empUpdateModal select\").val([empData.dId]);\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  // 点击更新，更新员工信息\r\n");
      out.write("  $(\"#emp_update_btn\").click(function () {\r\n");
      out.write("    // 校验邮箱\r\n");
      out.write("    var email = $(\"#email_update_input\").val();\r\n");
      out.write("    var regEmail = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\r\n");
      out.write("    if (!regEmail.test(email)) {\r\n");
      out.write("      show_validate_msg(\"#email_update_input\", \"error\", \"邮箱格式输入错误\");\r\n");
      out.write("      return false;\r\n");
      out.write("    } else {\r\n");
      out.write("      show_validate_msg(\"#email_update_input\", \"success\", \"\");\r\n");
      out.write("    }\r\n");
      out.write("    ;\r\n");
      out.write("    // 发送ajax请求保存更新的员工数据\r\n");
      out.write("    $.ajax({\r\n");
      out.write("      url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\" + $(this).attr(\"edit-id\"),\r\n");
      out.write("      type: \"PUT\",\r\n");
      out.write("      data: $(\"#empUpdateModal form\").serialize(),\r\n");
      out.write("      success: function (result) {\r\n");
      out.write("        // alert(result.msg);\r\n");
      out.write("        // 关闭模态框\r\n");
      out.write("        $(\"#empUpdateModal\").modal(\"hide\");\r\n");
      out.write("        // 回到该页面\r\n");
      out.write("        to_page(currentPage);\r\n");
      out.write("      }\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("  // 单个删除\r\n");
      out.write("  $(document).on(\"click\", \".delete_btn\", function () {\r\n");
      out.write("    // 是否删除对话框\r\n");
      out.write("    var empName = $(this).parents(\"tr\").find(\"td:eq(2)\").text();\r\n");
      out.write("    if (confirm(\"确定删除\" + empName + \"吗?\")) {\r\n");
      out.write("      $.ajax({\r\n");
      out.write("        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\" + $(this).attr(\"del-id\"),\r\n");
      out.write("        type: \"DELETE\",\r\n");
      out.write("        success: function (result) {\r\n");
      out.write("          // alert(result.msg);\r\n");
      out.write("          to_page(currentPage);\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("  $(\"#check_all\").click(function () {\r\n");
      out.write("    $(\".check_item\").prop(\"checked\", $(this).prop(\"checked\"));\r\n");
      out.write("  });\r\n");
      out.write("  $(document).on(\"click\", \".check_item\", function () {\r\n");
      out.write("    var flag = $(\".check_item:checked\").length == $(\".check_item\").length\r\n");
      out.write("    $(\"#check_all\").prop(\"checked\", flag);\r\n");
      out.write("  });\r\n");
      out.write("  $(\"#emp_deleteAll_btn\").click(function () {\r\n");
      out.write("    var empNames = \"\";\r\n");
      out.write("    var del_idstr = \"\";\r\n");
      out.write("    $.each($(\".check_item:checked\"), function () {\r\n");
      out.write("      empNames += $(this).parents(\"tr\").find(\"td:eq(2)\").text() + \";\";\r\n");
      out.write("      // 组装员工id字符串\r\n");
      out.write("      del_idstr += $(this).parents(\"tr\").find(\"td:eq(1)\").text() + \"-\";\r\n");
      out.write("    });\r\n");
      out.write("    // 取出多余的;\r\n");
      out.write("    empNames = empNames.substring(0, empNames.length - 1);\r\n");
      out.write("    // 取出多余的-\r\n");
      out.write("    del_idstr = del_idstr.substring(0, empNames.length - 1);\r\n");
      out.write("    if (confirm(\"确定删除\" + empNames + \"吗?\")) {\r\n");
      out.write("      $.ajax({\r\n");
      out.write("        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\" + del_idstr,\r\n");
      out.write("        type: \"DELETE\",\r\n");
      out.write("        success: function (result) {\r\n");
      out.write("          alert(result.msg);\r\n");
      out.write("          to_page(currentPage);\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
