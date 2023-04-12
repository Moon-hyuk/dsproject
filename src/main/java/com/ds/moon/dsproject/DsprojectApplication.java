package com.ds.moon.dsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@SpringBootApplication
public class DsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsprojectApplication.class, args);
	}
	
	@GetMapping(value="/")
	public String index() {
		return "뜨나";
	}
	


}
