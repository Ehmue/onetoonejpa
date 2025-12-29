package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.User;
import com.example.demo.services.UserService;


@Controller
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public String user(Model model) 
	{
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "user";
	}
	

}
