//package com.example.employee;
//
//import com.example.employee.entity.Employee;
//import com.example.employee.repository.CompanyRepository;
//import com.example.employee.repository.EmployeeRepository;
//import org.flywaydb.core.Flyway;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;
//
//@RunWith(SpringRunner.class)
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = NONE)
//public class CompanyJPATest {
//    @Autowired
//    private CompanyRepository companyRepository;
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Before
//    public void setUp() throws Exception {
//        Flyway flyway = new Flyway();
//        flyway.setDataSource("jdbc:mysql://localhost:3306/employee_db","root","123456");
//        flyway.clean();
//        flyway.migrate();
//    }
//
//    @Test
//    public void should_deleted_employees_in_company_when_given_company_name() throws Exception {
//        //1.删除tengxun公司以及其下的所有employee
//        companyRepository.deleteByName("tengxun");
//        Employee actualEmployee = employeeRepository.findFirstByName("xiaozhi");
//        assertThat(actualEmployee).isNull();
//    }
//}
