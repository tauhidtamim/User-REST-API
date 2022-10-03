package com.me.udemy.entity;

import java.util.List;

public class HelperTag {

	private List<String> tags;
	private double expiry;
	
	
	
	public HelperTag( ) {
		
	}
	
	public HelperTag(List<String> tags, double expiry) {
		super();
		this.tags = tags;
		this.expiry = expiry;
	}
	
	
	@Override
	public String toString() {
		return "HelperTag [tags=" + tags + ", expiry=" + expiry + "]";
	}

	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public double getExpiry() {
		return expiry;
	}
	public void setExpiry(double expiry) {
		this.expiry = expiry;
	}
	
	
}
