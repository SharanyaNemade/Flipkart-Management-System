package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flipkart.service.RegistrationService;



@Controller
public class LoginController
{
	
	
	@Autowired
	private RegistrationService registrationService;
	
	
	
	@GetMapping("/login")
	public String loginPage(Model model)
	{
		model.addAttribute("content", "login");	
		
		return "base";
	}
	
	
	
	@GetMapping("/register")
	public String showRegistrationPage(Model model)
	{
		//This line is usually found in a Java Spring MVC web application. It’s used in a controller method to send data from the backend (Java code) to the frontend (like a JSP or HTML page).
		
//		model: This is an object provided by Spring MVC. It's used to pass data from the controller to the view (the page that the user sees).
//		.addAttribute(): This is a method that adds data to the model. You give it a name (key) and a value.
//		"content": This is the key or the name of the data you're adding. It’s like a label.
//		"register": This is the value that goes with the key "content".
		
		model.addAttribute("content", "register");	
		return "base";
	}
	
	
	
	//	5/8/2025
	
	
	
	@PostMapping("/register")
	public String handleRegsitionPage(@RequestParam String username, @RequestParam String password, Model model)
	{
		registrationService.registerNewUser(username, password);
		model.addAttribute("content","index");
		return "base";
	}
	
}
