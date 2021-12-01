package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Customer;
import com.ibm.entity.User;
import com.ibm.service.CustomerService;

@CrossOrigin
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping(value="/customer",consumes="application/json")
	public String addCustomer(@RequestBody Customer c) {
		service.save(c);
		return "cutomer added";
	}

	@GetMapping(value="customer/{custId}", produces="application/json")
	public Customer getCustomer(@PathVariable int custId) {
		return service.fetch(custId);
}

	@GetMapping(value="/customers",produces ="application/json")
	public List<Customer> getAll(){
		return service.list();
	}
	
	@DeleteMapping(value="user/{custId}")
	public String delCustomer(@PathVariable int custId) {
		service.delete(custId);
		return "Customer deleted";
	}
	
	

}
