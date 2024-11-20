package com.taraktech.springbootbatchapp2.processor;

import org.springframework.batch.item.ItemProcessor;

import com.taraktech.springbootbatchapp2.entity.Employee;

public class EmployeeDataProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee employee) throws Exception {
		employee.setFirst_name(employee.getFirst_name().toUpperCase());
		employee.setLast_name(employee.getLast_name().toUpperCase());
		return null;
	}

}
