package com.ibm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.LoanApplication;
import com.ibm.repo.LoanApplicationRepository;
@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

	@Autowired
	private LoanApplicationRepository repo;
	
	@Override
	public void save(LoanApplication la) {
		// TODO Auto-generated method stub
		repo.save(la);
	}

	@Transactional
	@Override
	public LoanApplication fetch(int loanId) {
		// TODO Auto-generated method stub
		return repo.findById(loanId).get();
	}

	@Override
	public List<LoanApplication> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(int loanId) {
		// TODO Auto-generated method stub
		 repo.deleteById(loanId);
	}

}
