package com.me.udemy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.me.udemy.entity.Tag;
import com.me.udemy.repository.TagRepository;

@Service
@Transactional
public class TagService {
	
	@Autowired
	private TagRepository tagRepo;
	
	public void saveTag(Tag tag) {
		tagRepo.save(tag);
	}
}
