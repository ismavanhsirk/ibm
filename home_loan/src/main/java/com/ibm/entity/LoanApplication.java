package com.ibm.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "loan_application")
public class LoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;

	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer cust;

	@Column(name = "date_of_birth")
	private Date date_of_birth;

	@Column(name = "occupation", length = 15)
	private String occupation;

	@Column(name = "income", length = 10)
	private long income;

	@Column(name = "organisation_name", length = 15)
	private String organisation_name;

	@Column(name = "pan", length = 10)
	private String pan;

	@Column(name = "resi_address", length = 30)
	private String resi_address;

	@Column(name = "property_value", length = 10)
	private String property_value;

	@Column(name = "property_config", length = 30)
	private String property_config;

	@Column(name = "aadhar", length = 12)
	private String aadhar;

	@Column(name = "loan_status")
	private String loan_status;

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public String getOrganisation_name() {
		return organisation_name;
	}

	public void setOrganisation_name(String organisation_name) {
		this.organisation_name = organisation_name;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getResi_address() {
		return resi_address;
	}

	public void setResi_address(String resi_address) {
		this.resi_address = resi_address;
	}

	public String getProperty_value() {
		return property_value;
	}

	public void setProperty_value(String property_value) {
		this.property_value = property_value;
	}

	public String getProperty_config() {
		return property_config;
	}

	public void setProperty_config(String property_config) {
		this.property_config = property_config;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getLoan_status() {
		return loan_status;
	}

	public void setLoan_status(String loan_status) {
		this.loan_status = loan_status;
	}

}
