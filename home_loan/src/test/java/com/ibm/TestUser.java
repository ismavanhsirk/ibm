package com.ibm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.entity.User;
import com.ibm.repo.UserRepository;

@DataJpaTest
public class TestUser {
	
	private  UserRepository repo;
	
	
	@Test
	public void testAddUser() {
		User u=new User();
		u.setPassword("12345");
		u.setRole("user");
		
		
		
		
	}

}
