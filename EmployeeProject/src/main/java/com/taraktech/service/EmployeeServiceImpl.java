package com.taraktech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.taraktech.entities.Employee;
import com.taraktech.exception.EmployeeAlreadyExits;
import com.taraktech.exception.EmployeeNotExits;
import com.taraktech.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emps = employeeRepo.findAll();
		return emps;
	}

	@Override
	public Employee getEmployeeById(Integer eno) {
		Employee emps = employeeRepo.findEmployeeByEno(eno).get();
		if(emps==null) {
			throw new EmployeeNotExits("Employee not found...");
		}
		emps.setPassword(passwordEncoder.matches("Taraka@019", emps.getPassword()));
		//return employeeRepo.findEmployeeByEno(eno).orElseThrow(() -> new EmployeeNotExits("Employee Not Fund...!"));
	}

	@Override
	public String saveEmployee(Employee employee)  {
		//Employee emp = employeeRepo.findEmployeeByEname(employee.getEname()).get();
		Employee emp = employeeRepo.findEmployeeByEname(employee.getEname()).get();
		if (emp != null) {
			throw new EmployeeAlreadyExits("Employee already exits...!");
		} 
		employee.setPassword(passwordEncoder.encode(employee.getPassword()));
		employeeRepo.save(employee);
		return "Employee successfully saved...!";
	}

}
