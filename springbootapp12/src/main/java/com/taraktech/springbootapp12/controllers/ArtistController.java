package com.taraktech.springbootapp12.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("file:./config/artist.properties")
@RestController
public class ArtistController {
    @Autowired
    private Environment environment;

    @RequestMapping("/art")
    public String artistDetails(){
        String data = "<h1>"+environment.getProperty("artist.number");
        data = data + environment.getProperty("artist.name");
        data = data + environment.getProperty("artist.address")+"</h1>";
        return data;
    }
}
