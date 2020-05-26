package cn.itcast.test;


import cn.itcast.bean.Department;
import cn.itcast.bean.Employee;
import cn.itcast.dao.DepartmentMapper;
import cn.itcast.dao.EmployeeMapper;
import com.github.pagehelper.PageInfo;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class test {

  @Autowired
  private DepartmentMapper departmentMapper;
  @Autowired
  private EmployeeMapper employeeMapper;
  @Autowired
  private SqlSessionTemplate sqlSessionTemplate;

  @Test
  public void test01()
      throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
    List<String> warnings = new ArrayList<String>();
    File configFile = new File("mbg.xml");
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(configFile);
    DefaultShellCallback callback = new DefaultShellCallback(true);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    myBatisGenerator.generate(null);
  }

  @Test
  public void daoTest() {
//    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//    DepartmentMapper departmentMapper=applicationContext.getBean(DepartmentMapper.class);
//    departmentMapper.insertSelective(new Department(null,"运营部"));
//    departmentMapper.insertSelective(new Department(null,"宣传部"));
//    System.out.println(departmentMapper);
//    System.out.println(employeeMapper.insertSelective(new Employee(null,"小白","M","123123@qq.com",2)));
    EmployeeMapper employeeMapper = sqlSessionTemplate.getMapper(EmployeeMapper.class);
    for (int i = 0; i < 1000; i++) {
      String uid = UUID.randomUUID().toString().substring(0, 5) + i;
      employeeMapper.insertSelective(new Employee(null, uid, "M", uid + "@qq.com", 2));
    }
  }
  @Test
  public void test03(){
    Employee employee=employeeMapper.selectByPrimaryKeyWithDept(1);
  System.out.println(employee.toString());
  }
}
