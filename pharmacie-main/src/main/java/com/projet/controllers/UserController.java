package com.projet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.entities.User;
import com.projet.repository.UserRepository;



public class UserController {

	public UserController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private UserRepository userRepository;
	@ModelAttribute("user")
    public User user() {
        return new User();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	@PostMapping("/save")
	public String save(@RequestBody User user) {
		userRepository.save(user);
		return "redirect:/registration?success";
	}
}
