package com.taraktech.EmployeeProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taraktech.EmployeeProject1.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}