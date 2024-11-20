package com.taraktech.springboot22.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taraktech.springboot22.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
