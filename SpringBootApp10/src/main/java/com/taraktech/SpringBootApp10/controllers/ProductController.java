package com.taraktech.SpringBootApp10.controllers;

import com.taraktech.SpringBootApp10.beans.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private Product product;
    @RequestMapping("/product")
    public String productDetails(){
        String productDetails = "<h1> \n"+product.getProductNumber()+"\t"+product.getProductName()+"\t"+product.getProductPrice()+"\t"+product.getProductDeliveryAddress()+"</h1>";
        return productDetails;
    }
}
