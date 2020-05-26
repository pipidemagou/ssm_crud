package cn.itcast.service;

import cn.itcast.bean.Employee;
import cn.itcast.bean.EmployeeExample;
import cn.itcast.bean.EmployeeExample.Criteria;
import cn.itcast.dao.EmployeeMapper;
import com.github.pagehelper.PageHelper;
import java.beans.IntrospectionException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeMapper employeeMapper;

  //查询所有员工
  public List<Employee> getAll() {
    return employeeMapper.selectByExampleWithDept(null);
  }

  public void saveEmp(Employee employee) {
    employeeMapper.insertSelective(employee);
  }

  //检验用户名是否可用
  public Boolean checkUser(String empName) {
    EmployeeExample employeeExample = new EmployeeExample();
    Criteria criteria = employeeExample.createCriteria();
    criteria.andEmpNameEqualTo(empName);
    long count = employeeMapper.countByExample(employeeExample);
    return count == 0;
  }

  //按照员工id查询员工
  public Employee getEmp(Integer id) {
    return employeeMapper.selectByPrimaryKey(id);
  }

  //更新方法
  public void updateEmp(Employee employee) {
    employeeMapper.updateByPrimaryKeySelective(employee);
  }

  //删除员工
  public void deleteEmp(Integer id) {
    employeeMapper.deleteByPrimaryKey(id);
  }
  //批量删除
  public void deleteBatch(List<Integer> str_ids) {
  EmployeeExample example=new EmployeeExample();
  Criteria criteria=example.createCriteria();
  criteria.andEmpIdIn(str_ids);
  employeeMapper.deleteByExample(example);
  }

}

