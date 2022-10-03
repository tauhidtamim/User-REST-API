package com.me.udemy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	
	@Id	
	private String name;
	
	private double expiry;
	
	@ManyToMany(mappedBy = "usedTags")
	Set <User> likes = new HashSet<>(); 
	
	
	public Set<User> getLikes() {
		return likes;
	}

	public void setLikes(Set<User> likes) {
		this.likes = likes;
	}

	public Tag() {
		
	}
	
	public Tag(String name, double expiry) {
		super();
		this.name = name;
		this.expiry = expiry;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getExpiry() {
		return expiry;
	}
	public void setExpiry(double expiry) {
		this.expiry = expiry;
	} 
	
	
	
}
