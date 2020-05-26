package cn.itcast.service;

import cn.itcast.bean.Department;
import cn.itcast.dao.DepartmentMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

  @Autowired
  private DepartmentMapper departmentMapper;

  public List<Department> getDepts() {
    return departmentMapper.selectByExample(null);
  }
}
