package com.orderdemo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class OrderController {
	
	@GetMapping("/home")
	public String home() {
		return "This is a home page of Order Server";
	}
	
	@GetMapping("/order")
	public String order() {
		return "This is a Order page for  Order server";
	}
	
	
	

}
