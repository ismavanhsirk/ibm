/**
 * 
 * This interface contains LoanApplication repository
 * @author vamsi
 * @version 1.0
 * 
 * **/

package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {

}
