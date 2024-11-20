package com.taraktech.spring_data_jdbc.service;

import com.taraktech.spring_data_jdbc.entities.Employee;
import com.taraktech.spring_data_jdbc.repository.EmployeeCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeCRUDRepository employeeCRUDRepository;
    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        Employee employee1 =  employeeCRUDRepository.save(employee);
        return employee1;
    }

    @Override
    public Employee searchEmployee(Integer eno) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public String deleteEmployee(Integer eno) {
        return null;
    }
}
