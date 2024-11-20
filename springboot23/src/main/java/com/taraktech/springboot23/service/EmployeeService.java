package com.taraktech.springboot23.service;

import com.taraktech.springboot23.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee getEmployee(Integer id);
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Integer id);
    public List<Employee> getAllEmployee();
}
