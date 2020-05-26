package cn.itcast.controller;

import cn.itcast.bean.Department;
import cn.itcast.bean.Msg;
import cn.itcast.service.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//处理和部门有关的请求
@Controller
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  //  返回所有部门信息
  @RequestMapping("/depts")
  public @ResponseBody
  Msg getDepts() {
    List<Department> list = departmentService.getDepts();
    return Msg.success().add("depts", list);
  }
}
