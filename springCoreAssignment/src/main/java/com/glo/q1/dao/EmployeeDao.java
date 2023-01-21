package com.glo.q1.dao;

import com.glo.q1.beans.Address;
import com.glo.q1.beans.Employee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeDao {


   public List<Employee> findAll(){
        List<Employee> e_list=new ArrayList<>();
        e_list.add(new Employee("Miraz", "12345adl", "32000", "1998-07-12", "2022-09-17", new Address("23/1", "Ba/2 lane", "BKP")));
        e_list.add(new Employee("Anil", "135645adl", "12000", "1994-05-21", "2022-09-17", new Address("24/1", "C/2 lane", "KHR")));
        e_list.add(new Employee("Emily", "ert678", "50000", "1987-03-15", "2022-09-17", new Address("213/1", "N/2 lane", "SDR")));

        return e_list;
    }
}
