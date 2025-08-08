package com.flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flipkart.entity.Product;
import com.flipkart.service.CategoryService;






@Controller
@RequestMapping("/admin/")
public class ProductController {
		
	
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@GetMapping("/add")
	public String add_product(Model model)
	{
		model.addAttribute("product", new Product());
		model.addAttribute("category", categoryService.getAllCategories());
		
		return "add-product";
	}
	
}
