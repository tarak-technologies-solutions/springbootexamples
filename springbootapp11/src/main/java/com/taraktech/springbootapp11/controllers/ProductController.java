package com.taraktech.springbootapp11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("classpath:product.properties")
@RestController
public class ProductController {
    @Autowired
    private Environment environment;

    @RequestMapping("/pro")
    public String getProductDetails(){
        String productData = environment.getProperty("product.pid")+",";
        productData = productData + environment.getProperty("product.pname")+",";
        productData = productData + environment.getProperty("product.pprice");
        return "<h1>"+productData+"</h1>";
    }
}
