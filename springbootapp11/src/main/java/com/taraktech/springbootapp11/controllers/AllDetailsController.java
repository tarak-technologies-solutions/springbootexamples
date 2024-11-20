package com.taraktech.springbootapp11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@PropertySource({"classpath:product.properties","classpath:customer.properties","classpath:address.properties"})
@PropertySources({
        @PropertySource("classpath:product.properties"),
        @PropertySource("classpath:customer.properties"),
        @PropertySource("classpath:address.properties")
})
@RestController
public class AllDetailsController {

    @Autowired
    private Environment environment;

    @RequestMapping("/all")
    public String allDetails(){

        String productData = environment.getProperty("product.pid")+",";
        productData = productData + environment.getProperty("product.pname")+",";
        productData = productData + environment.getProperty("product.pprice");

        String customerData = environment.getProperty("customer.cid")+",";
        customerData = customerData + environment.getProperty("customer.cname")+",";
        customerData = customerData + environment.getProperty("customer.cqual");

        String addressDetails = environment.getProperty("address.aid")+",";
        addressDetails = addressDetails + environment.getProperty("address.astreet")+",";
        addressDetails = addressDetails + environment.getProperty("address.avillage");

        return "<h1>"+productData+"\t"
                +customerData+"\t"
                +addressDetails+"</h1>";
    }
}
