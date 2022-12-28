package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.neosoft.model.User;
import com.neosoft.service.UserService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception {
		
		System.out.println("i am in registeruser method");
		String tempEmailId=user.getEmailId();
		System.out.println(tempEmailId);
		if(tempEmailId != null && !"".equals(tempEmailId)) {
		User userObj=	userService.fetchUserByEmailId(tempEmailId);
			if(userObj != null) {
				throw new Exception("User with "+tempEmailId+" is already exist");
			}
		}
		User userObj=null;
		userObj=userService.saveUser(user);
		System.out.println(userObj.getEmailId());
		return userObj;
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempEmailId=user.getEmailId();
		String tempPass=user.getUserPassword();
		User userObj=null;
		if(tempEmailId !=null && tempPass !=null) {
			userObj=userService.fetchUserByEmailIdAndUserPassword(tempEmailId, tempPass);
		}
		if(userObj==null) {
			throw new Exception("Bad Credentials");
		}
		
		return userObj; 
		
	}
	@GetMapping("/GetAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@GetMapping("/GetUsersById/{id}")
	public User getUserById(@PathVariable("id")int userId) {
		return userService.getUserById(userId);
	}
	@DeleteMapping("/DeleteUsers/{id}")
	public String deleteUser(@PathVariable("id")int userId) {
		return userService.deleteUser(userId);
	}
	
	@PutMapping("/UpdateUsers/{id}")
	public User updateUser(@RequestBody User user,@PathVariable("id")int userId) {
		return userService.updateUser(user, userId);
	}
	
	
}