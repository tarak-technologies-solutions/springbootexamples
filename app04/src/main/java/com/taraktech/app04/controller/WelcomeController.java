package com.taraktech.app04.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcomeUser(){
        return "<h1>Welcome to Tarak Technologies Pvt ltd</h1>";
    }

}
