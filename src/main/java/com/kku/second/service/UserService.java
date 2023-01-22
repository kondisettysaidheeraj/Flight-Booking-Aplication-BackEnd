package com.kku.second.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kku.second.model.User;
import com.kku.second.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	
	public User singup(User user)
	{
		return userRepo.save(user);
	}

	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
	   //  User cemail=userRepo.findByuserEmail(email);
	     User cemail=userRepo.findByuserEmail(email);

	     if(cemail!=null) {
	    	if(cemail.getPasword().equals(password)) {
	    	 return true;
	    	}
	     }
		
		return false;
	}

}
