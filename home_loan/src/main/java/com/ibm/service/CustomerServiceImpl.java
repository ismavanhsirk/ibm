package com.ibm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Customer;
import com.ibm.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public void save(Customer c) {
		// TODO Auto-generated method stub
		repo.save(c);

	}

	@Transactional
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
