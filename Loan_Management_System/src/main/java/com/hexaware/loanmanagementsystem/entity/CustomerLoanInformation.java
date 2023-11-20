package com.hexaware.loanmanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class CustomerLoanInformation {

	@Id
	@SequenceGenerator(name="customerloanInfo_seq",initialValue=10000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="customerloanInfo_seq")
	private long loanInformationId;
	private long loanNumber;
	private String customerName;
	private double loanAmount;
	private LocalDate loanOrginationDate;
	private String loanStatus = "PENDING";

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Customer_ID")
	private CustomerDetails customerDetail;

	public CustomerLoanInformation() {
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

	public CustomerDetails getCustomerDetails() {
		return customerDetail;
	}

	public void setCustomerDetails(CustomerDetails customerDetail) {
		this.customerDetail = customerDetail;
	}

}
