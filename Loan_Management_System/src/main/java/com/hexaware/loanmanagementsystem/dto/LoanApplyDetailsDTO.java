package com.hexaware.loanmanagementsystem.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;

public class LoanApplyDetailsDTO {

	private long loanNo;
	@NotBlank(message = "LoanType is required")
	private String loanTypeName;
	@NotBlank(message = "enter the loan amount")
	private double loanAmount;
	private LocalDate loanApplyDate;
	@NotBlank(message = "property address  is required")
	private String propertyAddress;
	@NotBlank(message = "Customer name is required")
	private String customerName;

	public long getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public LocalDate getLoanApplyDate() {
		return loanApplyDate;
	}

	public void setLoanApplyDate(LocalDate loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
