package com.taraktech.springboot24.controller;

import com.taraktech.springboot24.model.Employee;
import com.taraktech.springboot24.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/save")
    public String addEmployee(@RequestBody Employee employee){
        String status = "";
        Employee employee1 = employeeService.addEmployee(employee);
        if (employee1 == null) {
            status = "Employee is not existed....";
        }else {
            status = "Employee is inserted....";
        }
        return status;
    }
    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") Long eid,@RequestBody Employee employee){
        String status = "";
       Employee employee1 = employeeService.updateEmployee(employee);
       if (employee1.getEname().equals(employee.getEname())){
           status = "Employee is updated..";
       }else {
           status = "Employee is not updated";
       }
       return status;
    }
    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable("id") Long eid){
        Employee employee = employeeService.getEmployee(eid);
        return employee;
    }
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        List<Employee> emps = employeeService.getAllEmployees();
        return emps;
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable("id") Long eid){
        employeeService.deleteEmployee(eid);
    }
}
