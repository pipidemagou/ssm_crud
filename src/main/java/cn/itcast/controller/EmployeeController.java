package cn.itcast.controller;

import cn.itcast.bean.Employee;
import cn.itcast.bean.Msg;
import cn.itcast.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

  //自动注入service
  @Autowired
  private EmployeeService employeeService;

  @RequestMapping("/checkUser")
  public @ResponseBody
  Msg checkuser(@RequestParam("empName") String empName) {
//    先判断用户名是否合法
    String rex = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})";
    if (!empName.matches(rex)) {
      return Msg.fail().add("va_msg", "用户名格式不符合");
    }
    Boolean b = employeeService.checkUser(empName);
    System.out.println(b);
    if (b) {
      return Msg.success();
    } else {
      return Msg.fail().add("va_msg", "用户名不可用");
    }
  }

  @RequestMapping("/emps")
  public @ResponseBody
  Msg getEmpsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
    //    引入分页插件,传入页码和每页的条数
    PageHelper.startPage(pn, 10);
    List<Employee> list = employeeService.getAll();
//    使用pageInfo包装查询后的结果，把pageInfo交给页面就行，包括了详细的分页数据
    PageInfo page = new PageInfo(list, 5);
    return Msg.success().add("pageInfo", page);
  }

  //  查询全部员工
  //  @RequestMapping("/emps")
  public String getEmps(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
    //    引入分页插件,传入页码和每页的条数
    PageHelper.startPage(pn, 10);
    List<Employee> list = employeeService.getAll();
    //    使用pageInfo包装查询后的结果，把pageInfo交给页面就行，包括了详细的分页数据
    PageInfo page = new PageInfo(list, 5);
    model.addAttribute("pageInfo", page);
    return "list";
  }

  //  rest风格
//  /emp/{id} GET   :查询员工
//  /emp POST       :保存员工
//  /emp/{id} PUT   :修改员工
//  /emp/{id} DELETE：删除员工
  @RequestMapping(value = "/emp", method = RequestMethod.POST)
  public @ResponseBody
  Msg saveEmp(@Valid Employee employee, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      Map<String, Object> map = new HashMap<>();
      List<FieldError> errors = bindingResult.getFieldErrors();
      for (FieldError fieldError : errors) {
        System.out.println("错误的字段名：" + fieldError.getField());
        System.out.println("错误信息：" + fieldError.getDefaultMessage());
        map.put(fieldError.getField(), fieldError.getDefaultMessage());
      }
      return Msg.fail().add("errorFields", map);
    } else {
      System.out.println(employee.toString());
      employeeService.saveEmp(employee);
      return Msg.success();
    }
  }

  //员工查找
  @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
  public @ResponseBody
  Msg getEmp(@PathVariable("id") Integer id) {
    Employee employee = employeeService.getEmp(id);
    return Msg.success().add("emp", employee);
  }

  //  员工更新
  @RequestMapping(value = "/emp/{empId}", method = RequestMethod.PUT)
  public @ResponseBody
  Msg saveEmp(Employee employee) {
    System.out.println(employee.toString());
    employeeService.updateEmp(employee);
    return Msg.success();
  }

  //  员工删除+批量删除
  @RequestMapping(value = "/emp/{ids}", method = RequestMethod.DELETE)
  public @ResponseBody
  Msg deleteEmpById(@PathVariable("ids") String ids) {
    if(ids.contains("-")){
      List<Integer> del_ids=new ArrayList<>();
      String[] str_ids=ids.split("-");
      for(String string:str_ids){
        del_ids.add(Integer.parseInt(string));
      }
      employeeService.deleteBatch(del_ids);
    }else{
      Integer id=Integer.parseInt(ids);
      employeeService.deleteEmp(id);
    }
    return Msg.success();
  }
}
