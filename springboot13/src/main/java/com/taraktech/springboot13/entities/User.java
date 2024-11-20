package com.taraktech.springboot13.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("${user.name}")
    private String name;
    @Value("${user.qual}")
    private String[] qual;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getQual() {
        return qual;
    }

    public void setQual(String[] qual) {
        this.qual = qual;
    }
}
