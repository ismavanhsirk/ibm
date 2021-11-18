package com.ibm.entity;

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

	@Column(name = "start_date")
	private Date start_date;

	@Column(name = "end_date")
	private Date end_date;

	@Column(name = "approved_amount")
	private long approved_amount;

	@Column(name = "intrest_rate")
	private long intrest_rate;

	@Column(name = "tenure")
	private String tenure;

	@Column(name = "emi_amount")
	private long emi_amount;

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

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public long getApproved_amount() {
		return approved_amount;
	}

	public void setApproved_amount(long approved_amount) {
		this.approved_amount = approved_amount;
	}

	public long getIntrest_rate() {
		return intrest_rate;
	}

	public void setIntrest_rate(long intrest_rate) {
		this.intrest_rate = intrest_rate;
	}

	public String getTenure() {
		return tenure;
	}

	public void setTenure(String tenure) {
		this.tenure = tenure;
	}

	public long getEmi_amount() {
		return emi_amount;
	}

	public void setEmi_amount(long emi_amount) {
		this.emi_amount = emi_amount;
	}

}
