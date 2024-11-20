package com.taraktech.SpringBootApp10.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "product")
public class Product {
    private Integer productNumber;
    private String productName;
    private Double productPrice;
    private String productDeliveryAddress;

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDeliveryAddress() {
        return productDeliveryAddress;
    }

    public void setProductDeliveryAddress(String productDeliveryAddress) {
        this.productDeliveryAddress = productDeliveryAddress;
    }
}
