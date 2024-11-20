package com.taraktech.springbootapp12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("classpath:employee.properties")
@RestController
public class EmployeeController {
    @Autowired
    private Environment environment;
    @RequestMapping("/emp")
    public String employeeDetails(){
        String data = "<h1>"+environment.getProperty("employee.number");
        data = data + environment.getProperty("employee.name");
        data = data + environment.getProperty("employee.address")+"</h1>";
        return data;
    }
}
