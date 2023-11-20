package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;


@Repository
public interface CustomerLoanInformationRepository extends JpaRepository<CustomerLoanInformation, Long> {

	public CustomerLoanInformation findByLoanNumber(long loanNumber);
	
}
