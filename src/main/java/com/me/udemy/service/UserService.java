package com.me.udemy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.me.udemy.entity.User;
import com.me.udemy.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	
	@Autowired
	private UserRepository userRepo;
	
	public void saveUser(User user) {
        userRepo.save(user);
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).get();
    }
    
}
