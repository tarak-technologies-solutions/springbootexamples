package com.taraktech.springboot22.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.taraktech.springboot22.controller.EmployeeController;
import com.taraktech.springboot22.model.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeController employeeController;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		Employee employee = new Employee();
		
		employee.setEno(1l);
		employee.setEname("Tarak");
		employee.setEsal(6000.0f);
		employee.setEaddr("CVM");
		
		Employee emp = employeeController.saveEmployee(employee);
		System.out.pritln(emp);
		 */
		
		/*
		Employee employee = employeeController.findEmployee(1l);
		System.out.println(employee.getEno());
		System.out.println(employee.getEname());
		System.out.println(employee.getEsal());
		System.out.println(employee.getEaddr());
		
		
		Employee employee = new Employee();
		employee.setEno(1l);
		employee.setEname("Lally");
		employee.setEsal(11000.0f);
		employee.setEaddr("Chennai");
		
		Employee updateEmployee = employeeController.updateEmployee(employee);
		System.out.println(updateEmployee);
		*/
		
		/*
		Employee employee = new Employee();
		employee.setEno(2l);
		employee.setEname("Saroja");
		employee.setEsal(12000.0f);
		employee.setEaddr("Gutur");
		
		Employee updateEmployee = employeeController.updateEmployee(employee);
		System.out.println(updateEmployee);
		*/
		
		//employeeController.deleteEmployee(2l);
		
		List<Employee> employees = employeeController.employees();
		employees.stream().forEach(System.out::println);
	}

}
