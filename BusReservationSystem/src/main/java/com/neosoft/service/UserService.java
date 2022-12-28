package com.neosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Driver;
import com.neosoft.model.User;
import com.neosoft.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {	
	return userRepository.save(user);
		}
	
	public User fetchUserByEmailId(String email) {
		return userRepository.findByEmailId(email);	 
	}
	
	public User fetchUserByEmailIdAndUserPassword(String email,String password)
	{
		return userRepository.findByEmailIdAndUserPassword(email, password);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	public String deleteUser(int userId) {
		userRepository.deleteById(userId);
		return "User with "+userId+" got deleted";
	}
	
	public User getUserById(int userId) {
		return userRepository.findById(userId).get();
	}
	
	public User updateUser(User user,int userId) {
		return userRepository.save(user);
	}
}