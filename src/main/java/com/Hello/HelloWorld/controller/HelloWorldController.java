package com.Hello.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}

}
