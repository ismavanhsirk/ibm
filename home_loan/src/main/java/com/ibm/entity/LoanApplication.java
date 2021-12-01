/**
 * 
 * This class is an entity class for loanApplication having one-one relation with ApprovedLoans entity
 * variables:loanId,dateOfBirth,income,occupation,organisationName,pan,resiAddress,propertyValue,
 * 			propertyConfig,aadhar,loanStatus.
 * foreign key:custId
 * @author samyuktha
 * @version 1.1.2
 * 
 * **/

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

	public LoanApplication(int loanId, Customer cust, Date dateOfBirth, String occupation, long income,
			String organisationName, String pan, String resiAddress, String propertyValue, String propertyConfig,
			String aadhar, String loanStatus) {
		super();
		this.loanId = loanId;
		this.cust = cust;
		this.dateOfBirth = dateOfBirth;
		this.occupation = occupation;
		this.income = income;
		this.organisationName = organisationName;
		this.pan = pan;
		this.resiAddress = resiAddress;
		this.propertyValue = propertyValue;
		this.propertyConfig = propertyConfig;
		this.aadhar = aadhar;
		this.loanStatus = loanStatus;
	}
	

	public LoanApplication() {
		super();
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;

	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "custId")
	private Customer cust;

	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	@Column(name = "occupation", length = 15)
	private String occupation;

	@Column(name = "income", length = 10)
	private long income;

	@Column(name = "organisationName", length = 15)
	private String organisationName;

	@Column(name = "pan", length = 10)
	private String pan;

	@Column(name = "resiAddress", length = 30)
	private String resiAddress;

	@Column(name = "propertyValue", length = 10)
	private String propertyValue;

	@Column(name = "propertyConfig", length = 30)
	private String propertyConfig;

	@Column(name = "aadhar", length = 12)
	private String aadhar;

	@Column(name = "loanStatus")
	private String loanStatus;

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getResiAddress() {
		return resiAddress;
	}

	public void setResiAddress(String resiAddress) {
		this.resiAddress = resiAddress;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public String getPropertyConfig() {
		return propertyConfig;
	}

	public void setPropertyConfig(String propertyConfig) {
		this.propertyConfig = propertyConfig;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	

}
