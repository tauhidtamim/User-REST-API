package com.me.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.udemy.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
