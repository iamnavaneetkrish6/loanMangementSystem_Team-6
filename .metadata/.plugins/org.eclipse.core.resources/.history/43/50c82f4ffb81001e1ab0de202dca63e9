package com.hexaware.loanmanagementsystem.entity;



import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
@Entity
public class LoanApplyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long loanNo;
	@NotBlank
	private long loanTypeId;
	@NotBlank
	private double loanAmount;
	@NotBlank
	private String propertyAddress;
	
	
	@NotBlank
	private long CustomerId;

	@ManyToOne
	@JoinColumn(name = "customer_ID")
	private CustomerDetails customerDetails;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "property_ID") 
	private PropertyDetails propertyDetails;


	@ManyToOne
	@JoinColumn(name = "loanType_ID")
	private LoanTypes loanTypes;
	private LocalDate loanApplyDate;


	public long getLoanNo() {
		return loanNo;
	}


	public void setLoanNo(long loanNo) {
		this.loanNo = loanNo;
	}


	public long getLoanTypeId() {
		return loanTypeId;
	}


	public void setLoanTypeId(long loanTypeId) {
		this.loanTypeId = loanTypeId;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public String getPropertyAddress() {
		return propertyAddress;
	}


	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}


	public long getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(long customerId) {
		CustomerId = customerId;
	}


	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}


	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}


	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}


	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}


	public LoanTypes getLoanTypes() {
		return loanTypes;
	}


	public void setLoanTypes(LoanTypes loanTypes) {
		this.loanTypes = loanTypes;
	}


	public LocalDate getLoanApplyDate() {
		return getLoanApplyDate();
	}


	public void setLoanApplyDate(LocalDate loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}



}
