package com.taraktech.springcrudrepository.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taraktech.springcrudrepository.enities.Employee;
import com.taraktech.springcrudrepository.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		return employee2;
	}

	@Override
	public Employee searchEmployee(Integer eno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(Integer eno) {
		// TODO Auto-generated method stub
		return null;
	}

}
