package com.hexaware.loanmanagementsystem.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	@NotBlank
	private String customerName;
	@NotBlank
	@Column(unique = true)
	private String customerUsername;
	@NotBlank
	@Size(min = 4, max = 10)
	private String customerPassword;
	@NotBlank
	private String customerAddress;
	@NotBlank
	private String customerState;
	@NotBlank
	private String customerCountry;
	@Email
	private String customerEmailId;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerDetails")
	private List<CustomerLoanHistory> customerLoanHistory;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CustomerAccountDetails_ID") 
	private CustomerAccountDetails CustomerAccountDetails; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customerDetails")
	private Set<LoanApplyDetails> loanApplyDetails;

	@OneToOne(mappedBy = "loanStatus")
	private CustomerLoanInformation customerLoanInformation;
	
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public List<CustomerLoanHistory> getCustomerLoanHistory() {
		return customerLoanHistory;
	}

	public void setCustomerLoanHistory(List<CustomerLoanHistory> customerLoanHistory) {
		this.customerLoanHistory = customerLoanHistory;
	}

	public CustomerAccountDetails getCustomerAccountDetails() {
		return CustomerAccountDetails;
	}

	public void setCustomerAccountDetails(CustomerAccountDetails customerAccountDetails) {
		CustomerAccountDetails = customerAccountDetails;
	}

	public Set<LoanApplyDetails> getLoanApplyDetails() {
		return loanApplyDetails;
	}

	public void setLoanApplyDetails(Set<LoanApplyDetails> loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}
	
	
	
	
	
}
