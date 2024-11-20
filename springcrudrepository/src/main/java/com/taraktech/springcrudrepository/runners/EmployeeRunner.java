/*
package com.taraktech.springcrudrepository.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.taraktech.springcrudrepository.controller.EmployeeController;
import com.taraktech.springcrudrepository.enities.Employee;
@Component
/public class EmployeeRunner implements ApplicationRunner{
	@Autowired
	private EmployeeController employeeController;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Employee employee = new Employee();
		employee.setEno(111);
		employee.setEname("Tarak");
		employee.setEsal(6000.0f);
		employee.setEaddr("CVM");
		
		Employee employee2 = employeeController.saveEmployee(employee);
		System.out.println(employee2);
	}

}
*/
