package com.glo.q1;

import com.glo.q1.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        //ApplicationContext interface = new one of the imp class (providing the configuration class name)
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);//this is the cotainer

//        //now we will fetch the bean from the container
//        Employee employee = context.getBean(Employee.class);
//        Address address = context.getBean(Address.class);
//
//        //we won't create object by our own rather spring will do that for us
//
//
//
//        //we will print the wiring part
//        System.out.println(employee.getAddress().getClass().getSimpleName());
//        System.out.println(employee.getEmp_name()+" ");
//        System.out.println(employee.getAddress().getStreet()+" ");

        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        employeeDao.findAll().forEach(System.out::println);


    }
}