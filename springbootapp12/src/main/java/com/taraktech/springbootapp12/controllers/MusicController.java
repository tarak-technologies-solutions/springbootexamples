package com.taraktech.springbootapp12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@PropertySource("file:music.properties")
@RestController
public class MusicController {
    @Autowired
    private Environment environment;

    @RequestMapping("/mus")
    public String musicDetails(){
        String data = "<h1>"+environment.getProperty("music.number");
        data = data + environment.getProperty("music.name");
        data = data + environment.getProperty("music.address")+"</h1>";
        return data;
    }
}
