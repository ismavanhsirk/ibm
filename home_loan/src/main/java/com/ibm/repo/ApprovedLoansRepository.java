/**
 * 
 * This interface contains ApprovedLoans repository
 * @author vamsi
 * @version 1.0
 * 
 * **/

package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.ApprovedLoans;

public interface ApprovedLoansRepository extends JpaRepository<ApprovedLoans, Integer> {

}
