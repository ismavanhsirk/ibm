package com.ibm.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetinController {
	@GetMapping(value="/Hello")
	public String sayHello() {
		
		return "Hello boot";
	}
	@PostMapping(value="/Hello")
	public String sayPostHello() {
		return "Hello post spring boot";
		
	}
	
	@PutMapping(value="/Hello")
	public String sayPutHello() {
		return "Hello put spring boot";
		
	}
	
	@DeleteMapping(value="/Hello")
	public String sayDelHello() {
		return "Hello del spring boot";
		
	}
	
	
	
	
}
