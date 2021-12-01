package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.User;
import com.ibm.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(value="/user",consumes="application/json")
	public String addUser(@RequestBody User u) {
		service.save(u);
		return "user added";
	}
	
	@GetMapping(value="user/{userId}", produces="application/json")
	public User getUser(@PathVariable int userId) {
		return service.fetch(userId);
}

	@GetMapping(value="/users",produces ="application/json")
	public List<User> getAll(){
		return service.list();
	}
	
	@DeleteMapping(value="user/{userId}")
	public String delUser(@PathVariable int userId) {
		service.delete(userId);
		return "User deleted";
	}

}
