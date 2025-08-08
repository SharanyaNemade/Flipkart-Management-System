package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
