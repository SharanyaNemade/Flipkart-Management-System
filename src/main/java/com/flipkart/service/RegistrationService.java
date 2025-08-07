package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.flipkart.entity.User;
import com.flipkart.repository.UserRepository;






//Your RegistrationService handles sign‑ups:
//It saves a User entity to the database.
//Password is BCrypt‑hashed (passwordEncoder.encode()).
//Role is stored as a string (ROLE_USER).
//This means you have users in the DB, but Spring Security still needs to know how to load them at login.


//Why you don’t see a UserDetailsService
//
//In Spring Security:
//You must have some implementation of UserDetailsService so it can:
//Fetch the user by username from the DB
//Compare the entered password with the stored hashed password
//Check roles for authorization




//RegistrationService → runs only when a new user signs up.
//It:
//Takes username & password from a form.
//Hashes the password.
//Saves the user to the database.
//Assigns a default role.





//RegistrationService Purpose
//Saves new users into the database.
//Encodes the password with BCrypt.
//Assigns a default role.
//It does not load users for authentication.










//UserDetailsService → runs every time a user logs in.
//It:
//Takes the username entered on the login form.
//Looks up that user in the database.
//Returns a UserDetails object containing username, hashed password, and roles for Spring Security to check.






//UserDetailsService Purpose
//Used only during login by Spring Security.
//Loads a user from the DB by username.
//Returns a UserDetails object with:
//Username
//Hashed password
//Roles / authorities




//	3. Why You Need Both



//| Service               | When Used         | Purpose                                       |
//| --------------------- | ----------------- | --------------------------------------------- |
//| `RegistrationService` | During **signup** | Create and save new user                      |
//| `UserDetailsService`  | During **login**  | Load existing user from DB for authentication |





//	Think of it like this:


	
//| Action                       | Service Responsible   |
//| ---------------------------- | --------------------- |
//| **Sign up** (create account) | `RegistrationService` |
//| **Log in** (authenticate)    | `UserDetailsService`  |










@Service
public class RegistrationService
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public User registerNewUser(String username, String Password)
	{
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.encode(Password));
		user.setRole("ROLE_USER");
		
		return userRepository.save(user);
		
	}
}
