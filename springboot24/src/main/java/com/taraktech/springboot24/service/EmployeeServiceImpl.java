package com.taraktech.springboot24.service;

import com.taraktech.springboot24.model.Employee;
import com.taraktech.springboot24.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Transactional
    @Override
    public Employee addEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Transactional
    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = employeeRepository.findById(employee.getEno()).get();
        //employee1.setEno(employee.getEno());
        employee1.setEname(employee.getEname());
        employee1.setEsal(employee.getEsal());
        employee1.setEaddr(employee.getEaddr());
        employeeRepository.save(employee);
        return employee1;
    }
    @Transactional
    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
    @Transactional
    @Override
    public void deleteEmployees() {
        employeeRepository.deleteAll();
    }
}
