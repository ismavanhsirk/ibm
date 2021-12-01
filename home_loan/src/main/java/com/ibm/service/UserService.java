/**
 * 
 * This interface is UserService , contains method declarations only
 * 
 * **/
package com.ibm.service;

import java.util.List;

import com.ibm.entity.User;

public interface UserService {

	void save(User u);
	
	User fetch(int userId);
	
	List<User> list();
	
	void delete(int userId);
	
	
	
}
