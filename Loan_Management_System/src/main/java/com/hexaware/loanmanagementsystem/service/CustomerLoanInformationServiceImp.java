package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.dto.CustomerLoanInformationDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;
import com.hexaware.loanmanagementsystem.exception.CustomerLoanInformationNotFoundException;
import com.hexaware.loanmanagementsystem.repository.CustomerLoanInformationRepository;

@Service
public class CustomerLoanInformationServiceImp implements ICustomerLoanInformationService {

	@Autowired
	private CustomerLoanInformationRepository customerLoanInformationRepository;

	Logger logger = LoggerFactory.getLogger(CustomerLoanInformationServiceImp.class);

	public CustomerLoanInformationServiceImp() {

		super();
	}

	@Override
	public CustomerLoanInformation createCustomerLoanInformation(
			CustomerLoanInformationDTO customerLoanInformationDto) {

		CustomerLoanInformation customerLoanInformation = new CustomerLoanInformation();
		customerLoanInformation.setLoanNumber(customerLoanInformationDto.getLoanNumber());
		customerLoanInformation.setLoanAmount(customerLoanInformationDto.getLoanAmount());
		customerLoanInformation.setCustomerName(customerLoanInformationDto.getCustomerName());
		customerLoanInformation.setLoanOrginationDate(customerLoanInformationDto.getLoanOrginationDate());
		customerLoanInformation.setLoanStatus(customerLoanInformationDto.getLoanStatus());

		return customerLoanInformationRepository.save(customerLoanInformation);
	}

	@Override
	public CustomerLoanInformation updateCustomerLoanInformation(
			CustomerLoanInformationDTO customerLoanInformationDto) {

		CustomerLoanInformation customerLoanInformation = new CustomerLoanInformation();
		customerLoanInformation.setLoanInformationId(customerLoanInformationDto.getLoanInformationId());
		customerLoanInformation.setLoanNumber(customerLoanInformationDto.getLoanNumber());
		customerLoanInformation.setLoanAmount(customerLoanInformationDto.getLoanAmount());
		customerLoanInformation.setCustomerName(customerLoanInformationDto.getCustomerName());
		customerLoanInformation.setLoanOrginationDate(customerLoanInformationDto.getLoanOrginationDate());
		customerLoanInformation.setLoanStatus(customerLoanInformationDto.getLoanStatus());

		return customerLoanInformationRepository.save(customerLoanInformation);
	}

	@Override
	public void deleteCustomerLoanInformation(long customerLoanInformationID) {

		customerLoanInformationRepository.deleteById(customerLoanInformationID);

	}

	@Override
	public CustomerLoanInformation getCustomerLoanInformationById(long customerLoanInformationID) {

		return customerLoanInformationRepository.findById(customerLoanInformationID)
				.orElseThrow(() -> new CustomerLoanInformationNotFoundException(HttpStatus.NOT_FOUND,
						"Customer loan information not found"));
	}

	@Override
	public List<CustomerLoanInformation> getAllCustomerLoanInformation() {

		List<CustomerLoanInformation> customerLoanInformations = customerLoanInformationRepository.findAll();

		if (customerLoanInformations.isEmpty()) {
			throw new CustomerLoanInformationNotFoundException(HttpStatus.NOT_FOUND,
					"Customer loan information not found");
		}

		return customerLoanInformations;
	}

	@Override
	public CustomerLoanInformation getByLoanNumber(long loanNumber) {

		CustomerLoanInformation customerLoanInformation = customerLoanInformationRepository
				.findByLoanNumber(loanNumber);

		if (customerLoanInformation.getLoanInformationId() == 0) {
			throw new CustomerLoanInformationNotFoundException(HttpStatus.NOT_FOUND,
					"Customer loan information not available for This Loan number:" + loanNumber);
		}

		return customerLoanInformation;
	}

	@Override
	public List<CustomerLoanInformation> getCustomerLoanHistoryByName(String customerName) {

		return customerLoanInformationRepository.findByCustomerName(customerName);
	}

}
