/**
 * 
 * This interface is LoanApplication service , contains method declarations only
 * 
 * **/

package com.ibm.service;

import java.util.List;

import com.ibm.entity.LoanApplication;

public interface LoanApplicationService {
	
	void save(LoanApplication la);
	
	LoanApplication fetch(int loanId);
	
	List<LoanApplication> list();
	
	void delete(int loanId);

}
