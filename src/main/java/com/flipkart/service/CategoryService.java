package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.entity.Category;
import com.flipkart.repository.CategoryRepository;

@Service
public class CategoryService {
	
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	
	public List<Category> getAllCategories()
	{
		return categoryRepository.findAll();
		
	}

}
