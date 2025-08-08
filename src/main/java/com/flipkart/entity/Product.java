package com.flipkart.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String description;
	
	@Column(length = 1000)
	private double price;	
	
	private int stock;
	
	private String image;
	
	private LocalDateTime created;
	
	private LocalDateTime updated;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	

	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}




	
	public Product() {
		this.created = LocalDateTime.now();
		this.updated = LocalDateTime.now();
	}

	
	
	
	
	
	public Product(Long id, String title, String description, double price, int stock, String image,
			LocalDateTime created, LocalDateTime updated, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.image = image;
		this.created = created;
		this.updated = updated;
		this.category = category;
	}

}
