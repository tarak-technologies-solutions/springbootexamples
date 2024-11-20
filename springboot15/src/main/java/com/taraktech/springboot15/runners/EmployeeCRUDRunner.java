package com.taraktech.springboot15.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeCRUDRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("This is from EmployeeCRUDRunner............");
        System.out.println(args.getOptionNames());
        System.out.println(args.getNonOptionArgs());
        System.out.println(args.getOptionValues("server.port"));
    }
}
