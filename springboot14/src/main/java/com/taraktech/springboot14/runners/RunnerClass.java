package com.taraktech.springboot14.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerClass implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is from Runner class");
    }
}
