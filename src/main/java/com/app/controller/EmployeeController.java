package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
		
	}
	
	@GetMapping("/add_emp")
	public String addEmployee() {
		return "addEmployee";
		
	}
	

}
