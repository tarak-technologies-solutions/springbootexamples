package com.taraktech.springbootapp21.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.taraktech.springbootapp21.controller.ProductController;

@Component
public class ProductRunner implements CommandLineRunner{
	private ProductController productController;

	@Override
	public void run(String... args) throws Exception {
		
	}

}
