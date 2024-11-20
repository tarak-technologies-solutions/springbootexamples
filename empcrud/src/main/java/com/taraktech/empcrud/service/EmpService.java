package com.taraktech.empcrud.service;

import com.taraktech.empcrud.model.Employee;

import java.util.List;

public interface EmpService {
    public List<Employee> getAllEmps();
    public Employee getEmpById(Long id);
    public String saveEmp(Employee employee);
    public String updateEmpById(Long id,Employee employee);
    public String deleteAllEmps();
    public String deleteEmpById(Long id);
}
