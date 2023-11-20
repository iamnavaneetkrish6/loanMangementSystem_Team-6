package com.hexaware.loanmanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Entity
public class CustomerAccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountDetailsId;
	@NotNull
	@Column(unique = true)
	private long accountNumber;
	@NotNull
	private String bankName;
	@NotBlank
	@Column(unique = true)
	private String panCardNumber;
	@NotBlank
	@Column(unique = true)
	private long aadharNumber;
	
	@OneToOne(mappedBy = "CustomerAccountDetails")
	private CustomerDetails customerDetails;
	
	public CustomerAccountDetails() {
		// TODO Auto-generated constructor stub
	}

	public long getAccountDetailsId() {
		return accountDetailsId;
	}

	public void setAccountDetailsId(long accountDetailsId) {
		this.accountDetailsId = accountDetailsId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}

	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	
	
}
