package com.taraktech.springbootapp12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("classpath:config/student.properties")
@RestController
public class StudentController {
    @Autowired
    private Environment environment;

    @RequestMapping("/stu")
    public String studentDetails(){
        String data = "<h1>"+environment.getProperty("student.number");
        data = data + environment.getProperty("student.name");
        data = data + environment.getProperty("student.address")+"</h1>";
        return data;
    }
}
