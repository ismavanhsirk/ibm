package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.ApprovedLoans;
import com.ibm.repo.ApprovedLoansRepository;

@Service
public class ApprovedLoanServiceImpl implements ApprovedLoanService {

	@Autowired
	private ApprovedLoansRepository repo;
	
	@Override
	public void save(ApprovedLoans al) {
		// TODO Auto-generated method stub
		repo.save(al);
	}

	@Override
	public ApprovedLoans fetch(int approvalId) {
		// TODO Auto-generated method stub
		return repo.findById(approvalId).get();
	}

	@Override
	public List<ApprovedLoans> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int approvalId) {
		// TODO Auto-generated method stub
		repo.deleteById(approvalId);
	}

}
