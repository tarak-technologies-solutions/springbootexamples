package com.tarakteck.sprinbootjdbc.runner;

import com.tarakteck.sprinbootjdbc.controller.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class EmployeeRunner implements CommandLineRunner {
    @Autowired
    private EmployeeController employeeController;
    @Override
    public void run(String... args) throws Exception {

    }
}
