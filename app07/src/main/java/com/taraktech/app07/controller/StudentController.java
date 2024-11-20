package com.taraktech.app07.controller;

import com.taraktech.app07.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private Student student;
    @RequestMapping("/stu")
    public String student(){

        return "<h1>Student Details "+student.getName()+","+student.getNumber()+","+student.getMarks()+"</h1>";
    }
}
