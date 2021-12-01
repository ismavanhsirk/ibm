/**
 * 
 * This class is an entity class for Customer having one-one relation with user entity
 * variables:custId,fullName,mobile,email.
 * foreign key:userId
 * @author samyuktha
 * @version 1.1.3
 * 
 * **/


package com.ibm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "customer")
public class Customer {
	
		

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;


	@Column(name = "full_name", length = 25)
	private String fullName;

	@Column(name = "mobile", length = 10)
	private String mobile;

	@Column(name = "email", length = 20)
	private String email;
	
	@Column(name="password",length=20)
	private String password;
	
	
	@Transient
	private String cPassword;
	


	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	
}
