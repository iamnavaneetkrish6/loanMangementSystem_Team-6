package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.LoanApplyDetails;


@Repository
public interface LoanApplyDetailsRepository extends JpaRepository<LoanApplyDetails, Long> {

	public LoanApplyDetails findByCustomerName(String customerName); 
	
}
