package com.me.udemy.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.udemy.entity.HelperTag;
import com.me.udemy.entity.Tag;
import com.me.udemy.entity.User;
import com.me.udemy.entity.UserResponse;
import com.me.udemy.service.UserService;

@RestController
@RequestMapping("users") // https://localhost:8080/users
public class UserSystemController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userID}")
	public ResponseEntity<UserResponse> getUser(@PathVariable Integer userID) {
		
		try {
			User user = userService.getUser(userID);
			
			UserResponse userResponse = new UserResponse(user.getId(), 
					user.getFirstName() + " " + user.getLastName(), user.getPhoneNo());
			
			return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK); 
		} catch(NoSuchElementException e){
			return new ResponseEntity<UserResponse>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		
		try {
			userService.saveUser(user);
			String response = "{\"id\": " + "\"" + user.getId() + "\"" + "}";
			return new ResponseEntity<String>(response,HttpStatus.CREATED);
		} catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
		}
		
	}
	
	
	@PostMapping("/{userId}/tags")
	public ResponseEntity<Void> createTagForUserHelper(@RequestBody HelperTag helperTag) {
		
		try {
			
			System.out.println(helperTag);
			
			double expiry = helperTag.getExpiry();
			List<String> tagList = helperTag.getTags();
			
			for(String tag: tagList) {
				createTagForUser(tag, expiry);
			}
			
			
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
		}
		
	}
	
	
	public ResponseEntity<Void> createTagForUser(String tag, double expiry) {
		
		try {
			
			
			
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} catch(Exception e) {
			System.out.println(e);
			return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
		}
		
	}
	
	
	
}
