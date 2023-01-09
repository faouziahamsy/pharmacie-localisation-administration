package com.projet.controllers;

import java.awt.PageAttributes.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RouteController {

	public RouteController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping(value = "/")
	// @ResponseBody
	public String login(Model model) {
		return "login";
	}

	@GetMapping(value = "/admin")
	// @ResponseBody
	public String admin(Model model) {
		return "index";
	}

	@GetMapping(value = "/pharmacien")
	// @ResponseBody
	public String pharmacien(Model model) {
		return "index";
	}

}
