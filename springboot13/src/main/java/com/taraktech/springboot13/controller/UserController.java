package com.taraktech.springboot13.controller;

import com.taraktech.springboot13.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private User user;

    @RequestMapping("/user")
    public String getUser(){
       String data = "<h1> User[";
       data =data+ "User Name : "+user.getName()+",";
       data=data+"Qualification : ";
        for (String q: user.getQual()) {
            data=data+q+" ";
        }
        data = data+"]</h1>";
        return data;
    }
}
