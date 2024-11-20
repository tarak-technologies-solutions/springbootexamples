package com.taraktech.app14.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CRUDRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        for (String arg:args) {
            System.out.println(arg);
        }
    }
}
