package com.hexaware.loanmanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerLoanInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanInformationID;
	private long loanAmount;
	private long loanTerm;
	private LocalDate loanOrginationDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loanNumber")
	private LoanApplyDetails loanApplyDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId")
	private CustomerDetails customerDetails;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loanStatusID")
	private LoanStatus loanStatus;

	public CustomerLoanInformation() {
		// TODO Auto-generated constructor stub
	}

	public long getLoanInformationID() {
		return loanInformationID;
	}

	public void setLoanInformationID(long loanInformationID) {
		this.loanInformationID = loanInformationID;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public long getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public LocalDate getLoanOrginationDate() {
		return loanOrginationDate;
	}

	public void setLoanOrginationDate(LocalDate loanOrginationDate) {
		this.loanOrginationDate = loanOrginationDate;
	}

	public LoanApplyDetails getLoanApplyDetails() {
		return loanApplyDetails;
	}

	public void setLoanApplyDetails(LoanApplyDetails loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public LoanStatus getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatus loanStatus) {
		this.loanStatus = loanStatus;
	}

}
