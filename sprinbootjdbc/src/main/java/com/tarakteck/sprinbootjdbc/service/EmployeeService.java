package com.tarakteck.sprinbootjdbc.service;

import com.tarakteck.sprinbootjdbc.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Optional<Employee> getEmployeeById(Long eno);
    public String saveEmployee(Employee employee);
    public String updateEmployee(Employee employee);
    public void deleteEmployee(Long eno);
}
