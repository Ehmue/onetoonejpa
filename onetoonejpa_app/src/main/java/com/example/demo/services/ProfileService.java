package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profile;
import com.example.demo.repository.ProfileRepository;

@Service
public class ProfileService 
{
	
	@Autowired
	public ProfileRepository profileRepository;
	
	public List<Profile> findAll()
	{
		return profileRepository.findAll();
	}
	
	public Profile save(Profile profile)
	{
		return profileRepository.save(profile);
	}
	
	public Profile findById(Integer id)
	{
		return profileRepository.findById(id).get();
	}

	public boolean deleteByid(Integer id) 
	{
		if(profileRepository.existsById(id))
		{
			profileRepository.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}
}
