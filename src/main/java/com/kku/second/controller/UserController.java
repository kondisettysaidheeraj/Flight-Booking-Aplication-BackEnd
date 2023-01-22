package com.kku.second.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kku.second.model.User;
import com.kku.second.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/flightreservation")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/signup")
	
	public User singup(@RequestBody User user)
	{
		
		return userService.singup(user);
	}
	
	@GetMapping("/login")
	public boolean login(@RequestParam String email,@RequestParam String password)
	{
		return userService.login(email,password);
		
	}
}
