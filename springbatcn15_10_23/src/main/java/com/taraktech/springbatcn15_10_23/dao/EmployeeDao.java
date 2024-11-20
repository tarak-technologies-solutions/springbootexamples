package com.taraktech.springbatcn15_10_23.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taraktech.springbatcn15_10_23.entity.Employee;
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
}
