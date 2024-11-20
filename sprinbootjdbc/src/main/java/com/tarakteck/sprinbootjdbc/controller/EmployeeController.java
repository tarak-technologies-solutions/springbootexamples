package com.tarakteck.sprinbootjdbc.controller;

import com.tarakteck.sprinbootjdbc.model.Employee;
import com.tarakteck.sprinbootjdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin("api")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public Employee getEmployee(Long eno) {
        Optional<Employee> employee = employeeService.getEmployeeById(eno);
    }
}
