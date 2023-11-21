/*package com.hexaware.loanmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.entity.CustomerLoanInformation;
import com.hexaware.loanmanagementsystem.service.ICustomerLoanHistoryService;

@RestController
@RequestMapping("/api/v1/customer-loan-history/")
public class CustomerLoanHistoryRestController {

	@Autowired
	private ICustomerLoanHistoryService customerLoanHistoryService;
	
	@GetMapping(value = "/getallloanhistory/{customerId}", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN,ROLE_USER')")
	public List<CustomerLoanInformation> getAllAdmin(@PathVariable String customerId ) {

		return customerLoanHistoryService.getCustomerLoanHistoryByCusmtomerName(customerId);
	}
}
*/