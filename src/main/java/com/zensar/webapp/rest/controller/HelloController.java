package com.zensar.webapp.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//writing test case for evry piece of business code including spring
//controller is mandate
@RestController
public class HelloController {
	@GetMapping("/Hello")
	public String getmessage() {
		System.out.println("testing say hello");
		return "Welcome to .......................";
	}
	
	@PostMapping("/greet")
	public ResponseEntity<String> createMessage(@RequestBody String msg) {
		return new ResponseEntity<String>("message created " + msg,HttpStatus.CREATED);
	}
}