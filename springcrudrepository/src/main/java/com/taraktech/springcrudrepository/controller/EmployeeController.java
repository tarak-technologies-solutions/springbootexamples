package com.taraktech.springcrudrepository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taraktech.springcrudrepository.enities.Employee;
import com.taraktech.springcrudrepository.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	private Employee employee;
	public Employee saveEmployee(Employee employee) {
		employee = employeeService.saveEmployee(employee);
		return employee;
	}
	@RequestMapping("/emp")
	public String empCrud() {
		String data = employee.getEno()+",";
		data = data + employee.getEname()+",";
		data = data + employee.getEsal()+",";
		data = data + employee.getEaddr();
		return "<h1 align='center'>"+data+"<h1>";
	}
}
