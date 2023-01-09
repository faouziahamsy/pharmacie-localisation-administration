package com.projet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.entities.User;
import com.projet.repository.UserRepository;


@Controller
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	  // Login form
	  /*@RequestMapping("/login.html")
	  public String login() {
	    return "login.html";
	  }*/
	
	  
	  @Autowired
	  private UserRepository userRepository;

	 

	 @PostMapping("/login")
	 public String loginn(@RequestParam String username,
	                      @RequestParam String password,
	                      Model model) {
	    User user = userRepository.findByUsernameAndPassword(username, password);
	    if (user != null) {
	      if(user.getRole().equals("pharmacien"))
	      return "redirect:/pharmacien";
	      return "redirect:/admin";
	    } else {
	      // Login failed, display error message
	      model.addAttribute("error", "Invalid username or password");
	      return "login";
	    }
	  }
	  
	  
	  
	  
	}