package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByEmailId(String emailId);
	
	public User findByEmailIdAndUserPassword(String emailId,String password);

}