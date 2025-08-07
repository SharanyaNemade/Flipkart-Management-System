package com.flipkart.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flipkart.entity.User;
import com.flipkart.repository.UserRepository;


//===========================================================================================================================================================================


	//	5/8/2025


@Service
public class CustomUserDetailsService implements UserDetailsService 
{
	
	@Autowired
	private UserRepository userRepository;

	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		User user = userRepository.findByUsername(username);
		
		
		if(user == null)
			throw new UsernameNotFoundException("User Not Found");
		
		
		return new org.springframework.security.core.userdetails.User(
				user.getUsername(),
				user.getPassword(),
				Collections.singleton(new SimpleGrantedAuthority(user.getRole()))
				
		);
	}	
}


//===========================================================================================================================================================================
