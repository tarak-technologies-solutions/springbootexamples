package com.taraktech.springboot22.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taraktech.springboot22.model.Employee;
import com.taraktech.springboot22.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional
	@Override
	public Employee saveEmpoyee(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return emp;
	}

	@Override
	public Employee readEmployee(Long eno) {
		Employee employee = employeeRepository.findById(eno).get();
		return employee;
	}

	@Transactional
	@Override
	public Employee updateEmployee(Employee employee) {

		Employee employee2 = employeeRepository.findById(employee.getEno()).get();
		employee2.setEno(employee.getEno());
		employee2.setEname(employee.getEname());
		employee2.setEsal(employee.getEsal());
		employee2.setEaddr(employee.getEaddr());
		Employee savedEmployee = employeeRepository.save(employee2);
		return savedEmployee;
	}

	@Transactional
	@Override
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		;
	}

	@Override
	public List<Employee> allEmployees() {
		List<Employee> empList = employeeRepository.findAll();
		return empList;
	}

}
