package com.hexaware.loanmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LoanStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanStatusId;
	private String loanStatus;

	@OneToOne(mappedBy = "loanStatus")
	private CustomerLoanInformation customerLoanInformation;

	private LoanApplyDetails loanApplyDetails;

	private CustomerDetails customerDetails;

	public long getLoanStatusId() {
		return loanStatusId;
	}

	public void setLoanStatusId(long loanStatusId) {
		this.loanStatusId = loanStatusId;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public CustomerLoanInformation getCustomerLoanInformation() {
		return customerLoanInformation;
	}

	public void setCustomerLoanInformation(CustomerLoanInformation customerLoanInformation) {
		this.customerLoanInformation = customerLoanInformation;
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

}
