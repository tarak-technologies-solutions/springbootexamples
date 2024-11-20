package com.taraktech.springcrudrepository.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taraktech.springcrudrepository.enities.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
