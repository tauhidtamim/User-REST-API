package com.me.udemy.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
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
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
