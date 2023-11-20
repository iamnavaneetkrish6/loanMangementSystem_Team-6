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
import jakarta.persistence.SequenceGenerator;

@Entity
public class LoanApplyDetails {

	@Id
	@SequenceGenerator(name="loan_seq",initialValue=100000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="loan_seq")
	private long loanNo;
	private String loanTypeName;
	private double loanAmount;
	private LocalDate loanApplyDate;
	private String propertyAddress;
	private String customerName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Customer_ID")
	private CustomerDetails customerDetails;

	public PropertyDetail getPropertyDetail() {
		return propertyDetail;
	}

	public void setPropertyDetail(PropertyDetail propertyDetail) {
		this.propertyDetail = propertyDetail;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loanType_ID")
	private LoanType loanType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PropertyDetails_ID")
	private PropertyDetail propertyDetail;

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

	public LoanType getLoantype() {
		return loanType;
	}

	public void setLoantype(LoanType loantype) {
		this.loanType = loantype;
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

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

}
