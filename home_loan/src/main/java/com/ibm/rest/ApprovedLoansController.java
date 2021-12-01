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

import com.ibm.entity.ApprovedLoans;
import com.ibm.service.ApprovedLoanService;

@CrossOrigin
@RestController
public class ApprovedLoansController {

	@Autowired
	private ApprovedLoanService service;
	
	@PostMapping(value="/approvedlaons",consumes="application/json")
	public String addApprovedLoans(@RequestBody ApprovedLoans al) {
		service.save(al);
		return "ApprovedLoan added";
	}
	
	@GetMapping(value="approvedloans/{approvalId}", produces="application/json")
	public ApprovedLoans getApprovedLoans(@PathVariable int approvalId) {
		return service.fetch(approvalId);
}

	@GetMapping(value="/approvedloans",produces ="application/json")
	public List<ApprovedLoans> getAll(){
		return service.list();
	}
	
	@DeleteMapping(value="approvedloans/{userId}")
	public String delApprovedLoans(@PathVariable int approvalId) {
		service.delete(approvalId);
		return "ApprovalLoan deleted";
	}
	
	
	
}
