package com.taraktech.springboobatchapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taraktech.springboobatchapp.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
