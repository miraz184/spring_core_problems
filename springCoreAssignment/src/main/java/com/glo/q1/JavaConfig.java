package com.glo.q1;

import com.glo.q1.beans.Address;
import com.glo.q1.beans.Employee;
import com.glo.q1.dao.EmployeeDao;
import org.springframework.context.annotation.*;

//@PropertySource("app.properties")
//@ComponentScan("com.glo")
@Configuration
public class JavaConfig {
    @Bean
    public Employee employee(){
        return new Employee();
    }
    @Bean
    public Address address(){
        return new Address();
    }

    @Bean
    public EmployeeDao employeeDao(){
        return new EmployeeDao();
    }
}
