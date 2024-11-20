package com.taraktech.app06.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {
	
	
	@Value("${name}")
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@RequestMapping("/wish")
	public String wishUser() {
		
		return "<h1>Welcome "+name+" to the tarak tech</h1>";
		
	}

}
