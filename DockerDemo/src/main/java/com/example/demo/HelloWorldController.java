package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloWorldController {

	@GetMapping
	public String displayMessage(){
		return "Welcome to the Docker World, Ramesh";
	}
	
}
