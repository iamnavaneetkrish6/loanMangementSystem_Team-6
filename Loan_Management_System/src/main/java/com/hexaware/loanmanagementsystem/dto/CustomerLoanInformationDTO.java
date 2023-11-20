package com.hexaware.loanmanagementsystem.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class CustomerLoanInformationDTO {

	private long loanInformationId;
	@NotBlank(message = "Loan Number  is required")
	private long loanNumber;
	@NotBlank(message = "customer name is required")
	private String customerName;
	@NotBlank(message = "loan amount is required")
	private double loanAmount;
	
	private LocalDate loanOrginationDate;

	private String loanStatus = "PENDING";

	public CustomerLoanInformationDTO() {
		super();
	}

	public long getLoanInformationId() {
		return loanInformationId;
	}

	public void setLoanInformationId(long loanInformationId) {
		this.loanInformationId = loanInformationId;
	}

	public long getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(long loanNumber) {
		this.loanNumber = loanNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public LocalDate getLoanOrginationDate() {
		return loanOrginationDate;
	}

	public void setLoanOrginationDate(LocalDate loanOrginationDate) {
		this.loanOrginationDate = loanOrginationDate;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

}
