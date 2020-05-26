<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <title>员工列表</title>
    <%--    引入jquery--%>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.4.1.min.js"></script>
    <%--    引入样式--%>
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<!-- 员工修改的模态框 -->
<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">员工修改</h4>
            </div>
            <div class="modal-body">
                <%--                员工添加表单--%>
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">empName</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="empName_update_static"></p>
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">email</label>
                        <div class="col-sm-10">
                            <input type="text" name="email" class="form-control"
                                   id="email_update_input"
                                   placeholder="email@qq.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">gender</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender1_update_input"
                                       value="M" checked="checked"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender"
                                       value="F"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">deptName</label>
                        <div class="col-sm-4">
                            <%--                            部门id--%>
                            <select class="form-control" name="dId" id="dept_add_select">
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="emp_update_btn">修改</button>
            </div>
        </div>
    </div>
</div>
<!-- 员工添加的模态框 -->
<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">员工添加</h4>
            </div>
            <div class="modal-body">
                <%--                员工添加表单--%>
                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">empName</label>
                        <div class="col-sm-10">
                            <input type="text" name="empName" class="form-control"
                                   id="empName_add_input"
                                   placeholder="empName">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">email</label>
                        <div class="col-sm-10">
                            <input type="text" name="email" class="form-control"
                                   id="email_add_input"
                                   placeholder="email@qq.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">gender</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender1_add_input"
                                       value="M" checked="checked"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="inlineRadio2"
                                       value="F"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">deptName</label>
                        <div class="col-sm-4">
                            <%--                            部门id--%>
                            <select class="form-control" name="dId" id="dept_add_select">
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="emp_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>
<%--搭建显示页面--%>
<div class="container">
    <%--    标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <%--        按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
            <button class="btn btn-danger" id="emp_deleteAll_btn">删除</button>
        </div>
    </div>
    <%--        表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="emps_table">
                <thead>
                <tr>
                    <th><input type="checkbox" id="check_all"/>
                    </th>
                    <th>员工编号</th>
                    <th>员工姓名</th>
                    <th>员工性别</th>
                    <th>员工邮件</th>
                    <th>员工部门</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <%--显示分页信息--%>
    <div>
        <%--分页文字信息--%>
        <div class="col-md-6" id="page_info_area">
        </div>
        <%--分页条信息--%>
        <div class="col-md-6" id="page_nave_area">

        </div>
    </div>
</div>
<script type="text/javascript">
  var currentPage;
  $(function () {
    to_page(1);
  })

  function to_page(pn) {
    $.ajax({
      url: "${APP_PATH}/emps",
      data: "pn=" + pn,
      type: "GET",
      success: function (result) {
        // 解析json并显示员工数据
        build_emps_table(result);
        // 解析json并显示分页信息
        build_page_info(result);
        build_page_nav(result);
      }
    });
  }

  function build_emps_table(result) {
    $("#emps_table tbody").empty();
    var emps = result.extend.pageInfo.list;
    $.each(emps, function (index, item) {
      var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
      var empIdTd = $("<td></td>").append(item.empId);
      var empNameTd = $("<td></td>").append(item.empName);
      var genderTd = $("<td></td>").append(item.gender == 'M' ? "男" : "女");
      var emailTd = $("<td></td>").append(item.email);
      var deptNameTd = $("<td></td>").append(item.department.deptName);
      var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn").append(
          $("<span></apan>").addClass("glyphicon glyphicon-pencil")).append("编辑");
      // 为编辑按钮添加一个自定义属性，来表示当前员工id
      editBtn.attr("edit-id", item.empId);
      var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn").append(
          $("<span></apan>").addClass("glyphicon glyphicon-trash")).append("删除");
      // 为删除按钮添加一个自定义属性，来表示当前员工id
      delBtn.attr("del-id", item.empId);
      var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
      $("<tr></tr>").append(checkBoxTd)
      .append(empIdTd)
      .append(empNameTd)
      .append(genderTd)
      .append(emailTd)
      .append(deptNameTd)
      .append(btnTd)
      .appendTo("#emps_table tbody");
    });
  }

  // 解析显示分页信息
  function build_page_info(result) {
    $("#page_info_area").empty();
    $("#page_info_area").append("当前"
        + result.extend.pageInfo.pageNum
        + "页,总共" + result.extend.pageInfo.pages
        + "页,总" + result.extend.pageInfo.total
        + "条记录"
    );
    currentPage = result.extend.pageInfo.pageNum;
  }

  // 解析显示分页条
  function build_page_nav(result) {
    $("#page_nave_area").empty();
    var ul = $("<ul></ul>").addClass("pagination");
    var firstPageLi = $("<li></li>").append($("<a></a>").append("首页")).attr("href", "#");
    var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
    if (result.extend.pageInfo.hasPreviousPage == false) {
      firstPageLi.addClass("disabled");
      prePageLi.addClass("disabled");
    } else {
      firstPageLi.click(function () {
        to_page(1);
      });
      prePageLi.click(function () {
        to_page(result.extend.pageInfo.pageNum - 1);
      });
    }
    var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
    var lastPageLi = $("<li></li>").append($("<a></a>").append("末页")).attr("href", "#");
    if (result.extend.pageInfo.hasNextPage == false) {
      nextPageLi.addClass("disabled");
      lastPageLi.addClass("disabled");
    } else {
      lastPageLi.click(function () {
        to_page(result.extend.pageInfo.pages);
      });
      nextPageLi.click(function () {
        to_page(result.extend.pageInfo.pageNum + 1);
      });
    }
    ul.append(firstPageLi).append(prePageLi);
    $.each(result.extend.pageInfo.navigatepageNums, function (index, item) {
      var numLi = $("<li></li>").append($("<a></a>").append(item));
      if (result.extend.pageInfo.pageNum == item) {
        numLi.addClass("active");
      }
      numLi.click(function () {
        to_page(item);
      });
      ul.append(numLi);
    });
    ul.append(nextPageLi).append(lastPageLi);
    var navEle = $("<nav></nav>").append(ul);
    navEle.appendTo("#page_nave_area");
  }

  function reset_form(ele) {
    $(ele)[0].reset();
    $(ele).find("*").removeClass("has-success has-error");
    $(ele).find(".help-block").text("");
  }

  // 点击新增按钮弹出模态框
  $("#emp_add_modal_btn").click(function () {
    // 清除表单数据（表单重置）
    reset_form("#empAddModal form");
    // 发送ajax请求，查出部门信息，显示在下拉列表中
    getDepts("#empAddModal select");
    // 弹出模态框
    $("#empAddModal").modal({
      backdrop: "static"
    });
  });

  // 查出所有的部门信息并显示在下拉列表中
  function getDepts(ele) {
    $(ele).empty();
    $.ajax({
      url: "${APP_PATH}/depts",
      type: "get",
      success: function (result) {
        // console.log(result);
        $.each(result.extend.depts, function () {
          var optionEle = $("<option ></option>").append(this.deptName).attr("value", this.deptId);
          optionEle.appendTo(ele);
        });
      }
    });
  }

  function validate_add_form() {
    // 拿到数据，用正则表达式
    var empName = $("#empName_add_input").val();
    var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
    // 校验人名
    if (!regName.test(empName)) {
      show_validate_msg("#empName_add_input", "error",
          "名字必须是2-5个中文或者6-16位英文数字组合");
      return false;
    } else {
      show_validate_msg("#empName_add_input", "success", "");
    }
    ;
    // 校验邮箱
    var email = $("#email_add_input").val();
    var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
    if (!regEmail.test(email)) {
      show_validate_msg("#email_add_input", "error", "邮箱格式输入错误");
      return false;
    } else {
      show_validate_msg("#email_add_input", "success", "");
    }
    ;
    return true;
  }

  // 显示校验提示信息
  function show_validate_msg(ele, status, msg) {
    $(ele).parent().removeClass("has-success has-error");
    $(ele).next("span").text("");
    if ("success" == status) {
      $(ele).parent().addClass("has-success");
    } else if ("error" == status) {
      $(ele).parent().addClass("has-error");
    }
    $(ele).next("span").text(msg);
  }

  $("#emp_save_btn").click(function () {
    // 校验数据
    if (!validate_add_form()) {
      return false;
    }
    if ($(this).attr("ajax-va") == "error") {
      return false;
    }
    // 校验用户名是否可用
    // 模态框中填写的表单数据提交给服务器进行保存
    $.ajax({
      url: "${APP_PATH}/emp",
      type: "POST",
      data: $("#empAddModal form").serialize(),
      success: function (result) {
        if (result.code == 100) {
          // 员工保存成功之后
          // 1.关闭模态框
          $("#empAddModal").modal('hide');
          // 2.到最后一页，显示保存的数据
          to_page(999);
        } else {
          // 显示失败信息
          if (undefined != result.extend.errorFields.email) {
            show_validate_msg("#email_add_input", "error", result.extend.errorFields.email);
          }
          if (undefined != result.extend.errorFields.empName) {
            show_validate_msg("#empName_add_input", "error", result.extend.errorFields.empName);
          }

        }
      }
    });
  });
  // 发送ajax请求用户名是否可用
  $("#empName_add_input").change(function () {
    var empName = this.value;
    $.ajax({
      url: "${APP_PATH}/checkUser",
      data: "empName=" + empName,
      type: "POST",
      success: function (result) {
        if (result.code == 100) {
          show_validate_msg("#empName_add_input", "success", "用户名可用");
          $("#emp_save_btn").attr("ajax-va", "success");
        } else {
          show_validate_msg("#empName_add_input", "error", result.extend.va_msg);
          $("#emp_save_btn").attr("ajax-va", "error");
        }
      }
    })
  });
  // 按钮创建之前就绑定click，所有绑定无效
  $(document).on("click", ".edit_btn", function () {
    // alert("edit");
    // 回显全部部门
    getDepts("#empUpdateModal select");
    // 查询员工信息
    getEmp($(this).attr("edit-id"));
    // 把员工的id传给更新按钮
    $("#emp_update_btn").attr("edit-id", $(this).attr("edit-id"));
    $("#empUpdateModal").modal({
      backdrop: "static"
    });
  });

  function getEmp(id) {
    $.ajax({
      url: "${APP_PATH}/emp/" + id,
      type: "GET",
      success: function (result) {
        // console.log(result);
        var empData = result.extend.emp;
        $("#empName_update_static").text(empData.empName);
        $("#email_update_input").val(empData.email);
        $("#empUpdateModal input[name=gender]").val([empData.gender]);
        $("#empUpdateModal select").val([empData.dId]);
      }
    });
  }

  // 点击更新，更新员工信息
  $("#emp_update_btn").click(function () {
    // 校验邮箱
    var email = $("#email_update_input").val();
    var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
    if (!regEmail.test(email)) {
      show_validate_msg("#email_update_input", "error", "邮箱格式输入错误");
      return false;
    } else {
      show_validate_msg("#email_update_input", "success", "");
    }
    ;
    // 发送ajax请求保存更新的员工数据
    $.ajax({
      url: "${APP_PATH}/emp/" + $(this).attr("edit-id"),
      type: "PUT",
      data: $("#empUpdateModal form").serialize(),
      success: function (result) {
        // alert(result.msg);
        // 关闭模态框
        $("#empUpdateModal").modal("hide");
        // 回到该页面
        to_page(currentPage);
      }
    });
  });
  // 单个删除
  $(document).on("click", ".delete_btn", function () {
    // 是否删除对话框
    var empName = $(this).parents("tr").find("td:eq(2)").text();
    if (confirm("确定删除" + empName + "吗?")) {
      $.ajax({
        url: "${APP_PATH}/emp/" + $(this).attr("del-id"),
        type: "DELETE",
        success: function (result) {
          // alert(result.msg);
          to_page(currentPage);
        }
      });
    }
  });
  $("#check_all").click(function () {
    $(".check_item").prop("checked", $(this).prop("checked"));
  });
  $(document).on("click", ".check_item", function () {
    var flag = $(".check_item:checked").length == $(".check_item").length
    $("#check_all").prop("checked", flag);
  });
  $("#emp_deleteAll_btn").click(function () {
    var empNames = "";
    var del_idstr = "";
    $.each($(".check_item:checked"), function () {
      empNames += $(this).parents("tr").find("td:eq(2)").text() + ";";
      // 组装员工id字符串
      del_idstr += $(this).parents("tr").find("td:eq(1)").text() + "-";
    });
    // 取出多余的;
    empNames = empNames.substring(0, empNames.length - 1);
    // 取出多余的-
    del_idstr = del_idstr.substring(0, empNames.length - 1);
    if (confirm("确定删除" + empNames + "吗?")) {
      $.ajax({
        url: "${APP_PATH}/emp/" + del_idstr,
        type: "DELETE",
        success: function (result) {
          alert(result.msg);
          to_page(currentPage);
        }
      });
    }
  });
</script>
</body>
</html>
