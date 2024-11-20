package com.tarakteck.sprinbootjdbc.repository;

import com.tarakteck.sprinbootjdbc.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeCrudRepository extends CrudRepository<Employee, Long> {

}
