package com.taraktech.spring_data_jdbc.service;

import com.taraktech.spring_data_jdbc.entities.Employee;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public Employee searchEmployee(Integer eno);
    public Employee updateEmployee(Employee employee);
    public String deleteEmployee(Integer eno);
}
