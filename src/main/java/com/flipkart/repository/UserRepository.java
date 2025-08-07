package com.flipkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipkart.entity.User;

public interface UserRepository extends JpaRepository<User,Long>
{
	
	User findByUsername(String username);
	
}
