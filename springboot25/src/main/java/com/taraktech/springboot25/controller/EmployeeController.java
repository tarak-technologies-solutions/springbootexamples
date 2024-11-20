package com.taraktech.springboot25.controller;

import com.taraktech.springboot25.model.Employee;
import com.taraktech.springboot25.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee> emps(){
        return employeeService.getAllEmployees();
    }
}
