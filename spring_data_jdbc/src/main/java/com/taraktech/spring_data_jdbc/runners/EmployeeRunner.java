package com.taraktech.spring_data_jdbc.runners;

import com.taraktech.spring_data_jdbc.controllers.EmployeeController;
import com.taraktech.spring_data_jdbc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements ApplicationRunner {
    @Autowired
    private EmployeeController employeeController;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Employee employee = new Employee();
        employee.setEno(111);
        employee.setEname("Tarak");
        employee.setEsal(6000.0f);
        employee.setEaddr("CVM");

       Employee emp = employeeController.saveEmploee(employee);
       System.out.println(emp);
    }
}
