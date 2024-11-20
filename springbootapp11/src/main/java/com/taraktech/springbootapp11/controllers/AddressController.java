package com.taraktech.springbootapp11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("classpath:address.properties")
@RestController
public class AddressController {
    @Autowired
    private Environment environment;

    @RequestMapping("/addr")
    public String getAddressDetails(){
        String addressDetails = environment.getProperty("address.aid")+",";
        addressDetails = addressDetails + environment.getProperty("address.astreet")+",";
        addressDetails = addressDetails + environment.getProperty("address.avillage");
        return "<h1>"+addressDetails+"</h1>";
    }
}
