package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.dto.CustomerLoanInformationDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;

public interface ICustomerLoanInformationService {

	public CustomerLoanInformation createCustomerLoanInformation(CustomerLoanInformationDTO customerLoanInformationDto);

	public CustomerLoanInformation updateCustomerLoanInformation(CustomerLoanInformationDTO customerLoanInformationDto);

	public void deleteCustomerLoanInformation(long customerLoanInformationID);

	public CustomerLoanInformation getCustomerLoanInformationById(long customerLoanInformationID);

	public List<CustomerLoanInformation> getAllCustomerLoanInformation();
	
	public CustomerLoanInformation getByLoanNumber(long loanNumber);

}
