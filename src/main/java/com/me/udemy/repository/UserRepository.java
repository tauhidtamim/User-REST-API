package com.me.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.udemy.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
