package com.flipkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
//===================================================================================================================================================================	
	
	
	//	29/7/2025
	
	
	@GetMapping("/")
	public String index(Model model) {
	    model.addAttribute("content", "index");
	    return "base";
	}

	
	
	
	@GetMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("content", "about");
		return "base";
	}
}


//===================================================================================================================================================================
