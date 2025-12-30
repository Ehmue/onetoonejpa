package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo.model.Profile;
import com.example.demo.model.User;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.services.ProfileService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class ProfileController 
{
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/profile")
	public String profile(Model model) 
	{
		List<Profile> profiles = profileService.findAll();
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
	
	@PostMapping("/profile/create")
	public String saveProfile(@ModelAttribute Profile profile)
	{
		Profile saveProfile = profileService.save(profile);
		return "redirect:/profile";
	}
	
	@GetMapping("/profile/edit/{id}")
	public String editForm(Model model, @PathVariable Integer id) 
	{
		Profile profile = profileService.findById(id);
		model.addAttribute("profile", profile);
		return "profile-edit";
	}
	
	@PostMapping("/profile/edit")
	public String editProcess(@ModelAttribute Profile profile)
	{
		Profile editProfile = profileService.save(profile);
		return "redirect:/profile";
	}
	
	@GetMapping("/profile/delete/{id}")
	public String deleteProfile(@PathVariable Integer id) 
	{
		boolean isDeleted = profileService.deleteByid(id);
		return "redirect:/profile";
	}
	
}
