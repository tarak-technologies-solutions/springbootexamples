package com.taraktech.springboot22.service;

import java.util.List;

import com.taraktech.springboot22.model.Employee;

public interface EmployeeService {
	public Employee saveEmpoyee(Employee employee);
	public Employee readEmployee(Long eno);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Long id);
	public List<Employee> allEmployees();
}
