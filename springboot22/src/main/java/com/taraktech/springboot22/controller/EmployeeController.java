package com.taraktech.springboot22.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.taraktech.springboot22.model.Employee;
import com.taraktech.springboot22.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeeService.saveEmpoyee(employee);
		return emp;
	}
	
	public Employee findEmployee(Long id) {
		Employee employee = employeeService.readEmployee(id);
		return employee;
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee updatedEmployee = employeeService.updateEmployee(employee);
		return updatedEmployee;
	}
	
	public void deleteEmployee(Long id) {
		employeeService.deleteEmployee(id);
	}
	
	public List<Employee> employees(){
		List<Employee> empList = employeeService.allEmployees();
		return empList;
	}
}
