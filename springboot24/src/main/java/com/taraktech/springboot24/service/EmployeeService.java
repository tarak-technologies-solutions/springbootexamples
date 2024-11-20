package com.taraktech.springboot24.service;

import com.taraktech.springboot24.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee getEmployee(Long id);
    public List<Employee> getAllEmployees();
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(long id);
    public void deleteEmployees();
}
