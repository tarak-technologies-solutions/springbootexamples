package com.tarakteck.sprinbootjdbc.service;

import com.tarakteck.sprinbootjdbc.model.Employee;
import com.tarakteck.sprinbootjdbc.repository.EmployeeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;
    @Transactional
    @Override
    public List<Employee> getAllEmployee() {

        return null;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long eno) {
        Optional<Employee> employee = employeeCrudRepository.findById(eno);
        return employee;
    }

    @Override
    public String saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public String updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long eno) {

    }
}
