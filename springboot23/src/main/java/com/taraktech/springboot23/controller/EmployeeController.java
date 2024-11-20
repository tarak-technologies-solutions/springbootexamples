package com.taraktech.springboot23.controller;

import com.taraktech.springboot23.model.Employee;
import com.taraktech.springboot23.service.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee){
        String message = "";
        if (employee != null) {
           Employee employee1 = employeeService.addEmployee(employee);
           message = "Employee stored successfully...";
        }else {
            message = "Employee is not stored...";
        }
        return message;
    }
    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
       return employeeService.getEmployee(id);
    }
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable("id") Long id){
        return  employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }
    @GetMapping("/emps")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }
}
