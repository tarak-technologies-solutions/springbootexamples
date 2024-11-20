package com.taraktech.springbatcn15_10_23.processor;

import org.springframework.batch.item.ItemProcessor;

import com.taraktech.springbatcn15_10_23.entity.Employee;


public class EmployeeDataProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee employee) throws Exception {
		employee.setGender(employee.getGender().toUpperCase());
		return employee;
	}

}
