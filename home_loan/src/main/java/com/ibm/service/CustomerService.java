/**
 * 
 * This interface is CustomerService , contains method declarations only
 * 
 * **/

package com.ibm.service;

import java.util.List;

import com.ibm.entity.Customer;

public interface CustomerService {

	void save (Customer c);
	
	Customer fetch(int custId);
	
	List<Customer> list();
	
	void delete(int custId);
	
}
