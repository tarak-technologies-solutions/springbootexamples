package com.taraktech.SpringBoot19.controller;

import com.taraktech.SpringBoot19.bean.ProfileEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Autowired
    private ProfileEnvironment profileEnvironment;
    @RequestMapping("/pc")
    public String getProfiles(){
        String data = profileEnvironment.getPortNum()+"<br>";
        data = data + profileEnvironment.getApplicationName()+"<br>";
        data = data + profileEnvironment.getDriverName()+"<br>";
        data = data + profileEnvironment.getUrl()+"<br>";
        data = data + profileEnvironment.getUserName()+"<br>";
        data = data + profileEnvironment.getPassword();
        return "<h1 style='color:red;' align = 'center'>"+data+"</h1>";
    }
}
