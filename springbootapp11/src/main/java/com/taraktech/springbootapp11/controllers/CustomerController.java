package com.taraktech.springbootapp11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("classpath:customer.properties")
@RestController
public class CustomerController {
    @Autowired
    private Environment environment;
    @RequestMapping("/cus")
    public String getCustomerDetails(){
        String customerData = environment.getProperty("customer.cid")+",";
        customerData = customerData + environment.getProperty("customer.cname")+",";
        customerData = customerData + environment.getProperty("customer.cqual");
        return "<h1>"+customerData+"</h1>";
    }
}
