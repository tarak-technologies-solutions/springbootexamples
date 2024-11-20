package com.taraktech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taraktech.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public Optional<Employee> findEmployeeByEno(Integer eno);
	public Optional<Employee> findEmployeeByEname(String name);
}
