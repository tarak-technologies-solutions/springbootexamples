package com.taraktech.springboobatchapp.processor;

import org.springframework.batch.item.ItemProcessor;

import com.taraktech.springboobatchapp.entity.Employee;

public class EmployeeDataProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee employee) throws Exception {
		employee.setCountry(employee.getCountry().toUpperCase());
		employee.setGender(employee.getGender().toUpperCase());
		return employee;
	}

}
