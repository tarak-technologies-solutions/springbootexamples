package com.taraktech.empcrud.service;

import com.taraktech.empcrud.model.Employee;
import com.taraktech.empcrud.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpRepository empRepository;

    @Override
    public List<Employee> getAllEmps() {
        List<Employee> emps = empRepository.findAll();
        return emps;
    }

    @Override
    public Employee getEmpById(Long id) {
        return empRepository.findById(id).get();
    }

    @Override
    public String saveEmp(Employee employee) {
        empRepository.save(employee);
        return "Employee is saved....";
    }

    @Override
    public String updateEmpById(Long id,Employee employee) {
        Employee employee1 = empRepository.findById(id).get();
        employee1.setFirst_name(employee.getFirst_name());
        employee1.setLast_name(employee.getLast_name());
        employee1.setEmail(employee.getEmail());
        employee1.setPassword(employee.getPassword());
        empRepository.save(employee1);
        return "Employee is updated....";
    }

    @Override
    public String deleteAllEmps() {
        empRepository.deleteAll();
        return "All employess are deleted....";
    }

    @Override
    public String deleteEmpById(Long id) {
        empRepository.deleteById(id);
        return "Employee is deleted....";
    }
}
