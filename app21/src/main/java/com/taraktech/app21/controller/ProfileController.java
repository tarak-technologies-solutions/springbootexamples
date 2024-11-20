package com.taraktech.app21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	@Autowired
	private Environment environment;
	@RequestMapping("/pc")
	public String getProfiles() {
		String data = environment.getProperty("server.port")+"<br>";
		data = data + environment.getProperty("spring.application.name")+"<br>";
		data = data + environment.getProperty("spring.datasource.driver-class-name")+"<br>";
		data = data + environment.getProperty("spring.datasource.url")+"<br>";
		data = data + environment.getProperty("spring.datasource.username")+"<br>";
		data = data + environment.getProperty("spring.datasource.password");
		return "<h1 align='center' style ='color:green'>"+data+"</h1>";
	}
}
