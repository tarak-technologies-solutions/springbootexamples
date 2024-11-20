package com.taraktech.springcrudrepository.services;

import com.taraktech.springcrudrepository.enities.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public Employee searchEmployee(Integer eno);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Integer eno);
}
