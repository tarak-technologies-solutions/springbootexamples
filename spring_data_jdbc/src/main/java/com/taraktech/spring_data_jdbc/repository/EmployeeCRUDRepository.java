package com.taraktech.spring_data_jdbc.repository;

import com.taraktech.spring_data_jdbc.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCRUDRepository extends CrudRepository<Employee,Integer> {
}
