package com.taraktech.springbootapp20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileEnvironment {
    @Autowired
    private Environment environment;
    @RequestMapping("/pd")
    public String getProfileDetails(){
        String data = environment.getProperty("server.port")+"<br>";
        data = data + environment.getProperty("spring.application.name")+"<br>";
        data = data + environment.getProperty("spring.datasource.driver-class-name")+"<br>";
        data = data + environment.getProperty("spring.datasource.url")+"<br>";
        data = data + environment.getProperty("spring.datasource.username")+"<br>";
        data = data + environment.getProperty("spring.datasource.password");
        return "<h1 style ='color:green;' align = 'center'>" + data +"</h1>";
    }
}
