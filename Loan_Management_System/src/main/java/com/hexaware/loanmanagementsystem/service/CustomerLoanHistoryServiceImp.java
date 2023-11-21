/*package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.CustomerDetails;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;
import com.hexaware.loanmanagementsystem.exception.CustomerLoanHistoryNotFound;
import com.hexaware.loanmanagementsystem.repository.CustomerDetailsRepository;

@Service
public class CustomerLoanHistoryServiceImp implements ICustomerLoanHistoryService {

	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;

	Logger logger = LoggerFactory.getLogger(CustomerLoanHistoryServiceImp.class);
	
	
	public CustomerLoanHistoryServiceImp() {
		super();
	}

	@Override
	public List<CustomerLoanInformation> getCustomerLoanHistoryByCusmtomerName(String customerName) {

		CustomerDetails customerDetails = customerDetailsRepository.findByCustomerName(customerName);

		List<CustomerLoanInformation> customerLoanInformations= customerDetails.getCustomerLoanInformation();
		
		if(customerLoanInformations.isEmpty()) {
			throw new CustomerLoanHistoryNotFound(HttpStatus.NOT_FOUND,"Loan history not available for :"+ customerName);
		}
		
		logger.info("CustomerLoanInformation Service Implementation-Fetching admin with customerName :{}",customerName);
		
		return customerDetails.getCustomerLoanInformation();
	}

}*/
