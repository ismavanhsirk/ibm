/**
 * 
 * This class is an entity class for ApprovedLoans having one-one relation with LoanApplication entity
 * variables:startDate,endDate,approvedAmount,tenure,intrestRate,emiAmount.
 * foreign key:loanId
 * @author samyuktha
 * @version 1.1.5
 * 
 * **/package com.ibm.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "approved_loans")
public class ApprovedLoans {

	@OneToOne(targetEntity = LoanApplication.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "loanId")
	private LoanApplication la;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int approvalId;

	@Column(name = "startDate")
	private Date startDate;

	@Column(name = "endDate")
	private Date endDate;

	@Column(name = "approvedAmount")
	private long approvedAmount;

	@Column(name = "intrestRate")
	private long intrestRate;

	@Column(name = "tenure")
	private String tenure;

	@Column(name = "emiAmount")
	private long emiAmount;

	public LoanApplication getLa() {
		return la;
	}

	public void setLa(LoanApplication la) {
		this.la = la;
	}

	public int getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(int approvalId) {
		this.approvalId = approvalId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(long approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	public long getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(long intrestRate) {
		this.intrestRate = intrestRate;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public long getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(long emiAmount) {
		this.emiAmount = emiAmount;
	}

	}
