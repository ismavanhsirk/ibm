package com.ibm.service;

import java.util.List;

import com.ibm.entity.Customer;
import com.ibm.repo.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository repo;
	
	@Override
	public void save(Customer c) {
		// TODO Auto-generated method stub
		repo.save(c);

	}

	@Override
	public Customer fetch(int custId) {
		// TODO Auto-generated method stub
		return repo.findById(custId).get();
	}

	@Override
	public List<Customer> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int custId) {
		// TODO Auto-generated method stub
		repo.deleteById(custId);
	}

}
