package com.taraktech.pagingandsorting.repository;

import com.taraktech.pagingandsorting.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {

}
