package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() 
	{
		
		return userRepository.findAll();
		
	}
	
	public User save(User user)
	{
		return userRepository.save(user);
	}
	
	public User findById(Integer id)
	{
		return userRepository.findById(id).get();
	}

	public boolean deleteByid(Integer id) 
	{
		if(userRepository.existsById(id))
		{
			userRepository.deleteById(id);
			return true;
		}
		else {
			return false;
		}
	}
	
}
