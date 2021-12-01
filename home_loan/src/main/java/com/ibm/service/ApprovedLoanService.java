/**
 * 
 * This interface is ApprovedLoanService , contains method declarations only
 * 
 * **/

package com.ibm.service;

import java.util.List;

import com.ibm.entity.ApprovedLoans;

public interface ApprovedLoanService {

	void save(ApprovedLoans al);
	
	ApprovedLoans fetch(int approvalId);
	
	List<ApprovedLoans> list();
	
	void delete(int approvalId);
	
	
}
