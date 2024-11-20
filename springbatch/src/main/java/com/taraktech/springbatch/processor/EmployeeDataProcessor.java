package com.taraktech.springbatch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.taraktech.springbatch.entity.Employee;

public class EmployeeDataProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee employee) throws Exception {
		employee.setFirst_name(employee.getFirst_name().toUpperCase());
		employee.setLast_name(employee.getLast_name().toUpperCase());
		employee.setGender(employee.getGender().toUpperCase());
		return employee;
	}

}
