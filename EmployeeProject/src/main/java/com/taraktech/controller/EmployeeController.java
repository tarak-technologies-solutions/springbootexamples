package com.taraktech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taraktech.entities.Employee;
import com.taraktech.exception.EmployeeAlreadyExits;
import com.taraktech.service.EmployeeService;

@RestController
@RequestMapping("/emps")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {
		Employee employee = employeeService.getEmployeeById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@PostMapping(value = "/save",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
		String msg = employeeService.saveEmployee(employee);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	/*
	 * @ExceptionHandler(EmployeeAlreadyExits.class) public ResponseEntity<String>
	 * handleAlreadyExits(EmployeeAlreadyExits e){ String message = e.getMessage();
	 * return new ResponseEntity<>("Employee already exits..!",HttpStatus.CONFLICT);
	 * }
	 */
}