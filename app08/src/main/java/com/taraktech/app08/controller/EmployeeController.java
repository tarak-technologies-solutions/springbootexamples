package com.taraktech.app08.controller;

import com.taraktech.app08.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private Employee employee;
    @RequestMapping("/emp")
    public String employeeDetails(){

        String empDetails = "Emp Details "+employee.getNumber()+","+employee.getName()+","+employee.getSal()+","+employee.getAddr()+"";

        return "<h1>"+empDetails+"</h1>";

    }

}
