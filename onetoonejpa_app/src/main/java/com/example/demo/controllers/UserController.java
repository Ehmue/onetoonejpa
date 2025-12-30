package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Profile;
import com.example.demo.model.User;
import com.example.demo.services.ProfileService;
import com.example.demo.services.UserService;


@Controller
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/user")
	public String user(Model model) 
	{
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "user";
	}
	
	@GetMapping("/user/create")
	public String createProfile(Model model)
	{
		List<Profile> profiles = profileService.findAll();
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("profiles", profiles);
		return "user-create";
		
	}
	
	@PostMapping("/user/create")
	public String saveProfile(@ModelAttribute User user)
	{
		User saveUser = userService.save(user);
		return "redirect:/user";
	}
	
	@GetMapping("/user/edit/{id}")
	public String editForm(Model model, @PathVariable Integer id) 
	{
		List<Profile> profiles = profileService.findAll();
		User user = userService.findById(id);
		model.addAttribute("profiles", profiles);
		model.addAttribute("user", user);
		return "user-edit";
	}
	
	@PostMapping("/user/edit")
	public String editProcess(@ModelAttribute User user)
	{
		
		User editUser = userService.save(user);
		return "redirect:/user";
	}
	
	@GetMapping("/user/delete/{id}")
	public String deleteUser(@PathVariable Integer id) 
	{
		boolean isDeleted = userService.deleteByid(id);
		return "redirect:/user";
	}
	

}
