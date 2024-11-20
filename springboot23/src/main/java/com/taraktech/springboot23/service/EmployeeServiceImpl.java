package com.taraktech.springboot23.service;

import com.taraktech.springboot23.model.Employee;
import com.taraktech.springboot23.repository.EmployeeRepository;
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
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }
    @Transactional
    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employee1 = employeeRepository.findById(employee.getEno()).get();
        employee1.setEno(employee.getEno());
        employee1.setEname(employee.getEname());
        employee1.setEsal(employee.getEsal());
        employee1.setEaddr(employee.getEaddr());
        return employee1;
    }
    @Transactional
    @Override
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
