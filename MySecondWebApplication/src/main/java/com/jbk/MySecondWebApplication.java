package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.jbk") 
public class MySecondWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySecondWebApplication.class, args);
	}

}
