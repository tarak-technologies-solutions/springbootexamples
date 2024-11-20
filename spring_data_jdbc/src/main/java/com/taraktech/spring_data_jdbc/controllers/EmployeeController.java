package com.taraktech.spring_data_jdbc.controllers;

import com.taraktech.spring_data_jdbc.entities.Employee;
import com.taraktech.spring_data_jdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public Employee saveEmploee(Employee employee){
        Employee employee1 = employeeService.saveEmployee(employee);
        return employee1;
    }
}
