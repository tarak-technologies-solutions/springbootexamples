package com.taraktech.service;

import java.util.List;

import com.taraktech.entities.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Integer eno);
	String saveEmployee(Employee employee);
}
