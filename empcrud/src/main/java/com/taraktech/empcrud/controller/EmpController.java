package com.taraktech.empcrud.controller;

import com.taraktech.empcrud.model.Employee;
import com.taraktech.empcrud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping
    public String emp(){
        return "welcome to the employee...";
    }
    @GetMapping(value = "emps")
    public List<Employee> getAllEmployees(){
        return empService.getAllEmps();
    }
    @GetMapping(value = "employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return empService.getEmpById(id);
    }
    @PostMapping(value = "save")
    public String saveEmp(@RequestBody Employee employee){
        return empService.saveEmp(employee);
    }
    @PutMapping(value = "update/{id}")
    public String updateEmp(@PathVariable("id") Long id,@RequestBody Employee employee){
        return empService.updateEmpById(id,employee);
    }
    @DeleteMapping(value = "delete")
    public String deleteEmps(){
       return empService.deleteAllEmps();
    }
    @DeleteMapping(value = "delete/{id}")
    public String deleteByEmpId(@PathVariable("id") Long id){
        return empService.deleteEmpById(id);
    }
}
