package com.hexaware.loanmanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CustomerLoanHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanNo;
	private LocalDate loanOrginationDate;
	private long loanAmount;
	private String loanRepaymentStatus;

	@ManyToOne
	@JoinColumn(name = "customerDetails")
	private CustomerDetails customerDetails;

	public long getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}

	public LocalDate getLoanOrginationDate() {
		return loanOrginationDate;
	}

	public void setLoanOrginationDate(LocalDate loanOrginationDate) {
		this.loanOrginationDate = loanOrginationDate;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanRepaymentStatus() {
		return loanRepaymentStatus;
	}

	public void setLoanRepaymentStatus(String loanRepaymentStatus) {
		this.loanRepaymentStatus = loanRepaymentStatus;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	
	
}
