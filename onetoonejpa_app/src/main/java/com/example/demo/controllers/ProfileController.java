package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.model.Profile;
import com.example.demo.repository.ProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProfileController 
{
	@Autowired
	private ProfileRepository profileRepository;
	
	@GetMapping("/profile")
	public String profile(Model model) 
	{
		List<Profile> profiles = profileRepository.findAll();
		model.addAttribute("profiles", profiles);
		return "profile";
	}
	
	@GetMapping("/profile/create")
	public String createProfile(Model model)
	{
		Profile profile = new Profile();
		model.addAttribute("profile", profile);
		return "profile-create";
		
	}
	

}
