package com.glo.q1.beans;


public class Employee {
 //   @Value("${employee.name}")
    private String emp_name;
  //  @Value("${employee.id}")
    private String emp_id;
  //  @Value("${employee.salary}")
    private String salary;
    //@Value("${employee.dob}")
    private String dob;
 //   @Value("${employee.doj}")
    private String doj;
//    @Autowired
//    @Qualifier("address")
    private Address address;


//    public Employee(Address address ){
//        this.address=address;
//    }


    public Employee() {
    }

    public Employee(String name, String empId, String salary, String dob, String doj, Address address ){
        this.emp_name=name;
        this.emp_id=empId;
        this.salary=salary;
        this.dob=dob;
        this.doj=doj;
        this.address=address;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public Address getAddress() {
        return address;
    }
    //here we are telling spring to wire or inject dependency
//    @Autowired
//    @Qualifier("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [employeeName=" + emp_name + ", employeeId=" + emp_id + ", salary=" + salary + ", dob="
                + dob + ", doj=" + doj + ", address=" + address + "]";
    }
}
