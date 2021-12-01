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

import com.ibm.entity.LoanApplication;
import com.ibm.entity.User;
import com.ibm.service.LoanApplicationService;

@CrossOrigin
@RestController
public class LoanApplicationController {

	@Autowired
	private LoanApplicationService service;
	

	@PostMapping(value="/loanapplication",consumes="application/json")
	public String addLoanApplication(@RequestBody LoanApplication l) {
		service.save(l);
		return "Loan Application added";
	}
	
	@GetMapping(value="loanapplication/{custId}", produces="application/json")
	public LoanApplication getloanapplication(@PathVariable int loanId) {
		return service.fetch(loanId);
}

	@GetMapping(value="/loanapplications",produces ="application/json")
	public List<LoanApplication> getAll(){
		return service.list();
	}
	
	@DeleteMapping(value="loanapplication/{custId}")
	public String delLoanApplication(@PathVariable int loanId) {
		service.delete(loanId);
		return "LoanApplication deleted";
	}
	
	
	
}
