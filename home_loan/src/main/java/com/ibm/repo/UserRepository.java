/**
 * 
 * This interface contains userRepository
 * @author vamsi
 * @version 1.0
 * 
 * **/

package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
