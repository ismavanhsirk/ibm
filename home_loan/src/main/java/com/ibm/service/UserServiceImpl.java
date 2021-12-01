/**
 * 
 * This class implements UseService and its methods are defined here
 * 
 *  **/

package com.ibm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.User;
import com.ibm.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;
	
	@Transactional
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		repo.save(u);

	}

	@Override
	public User fetch(int userId) {
		// TODO Auto-generated method stub
		return repo.findById(userId).get();
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int userId) {
		// TODO Auto-generated method stub
		repo.deleteById(userId);
	}

}
