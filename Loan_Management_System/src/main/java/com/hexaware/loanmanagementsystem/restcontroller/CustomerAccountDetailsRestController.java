package com.hexaware.loanmanagementsystem.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.dto.CustomerAccountDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerAccountDetails;
import com.hexaware.loanmanagementsystem.service.ICustomerAccountDetailsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/customer-account-details")
public class CustomerAccountDetailsRestController {

	@Autowired
	private ICustomerAccountDetailsService customerAccountDetailsService;

	@PostMapping(value = "/addcustomer-details", consumes = "application/json", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public CustomerAccountDetails createCustomerAccountDetails(
			@RequestBody @Valid CustomerAccountDetailsDTO customerAccountDetailsDto) {

		return customerAccountDetailsService.createCustomerAccountDetails(customerAccountDetailsDto);
	}

	@PutMapping(value = "/updatecustomer-details", consumes = "application/json", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public CustomerAccountDetails updateCustomerAccountDetails(
			@RequestBody @Valid CustomerAccountDetailsDTO customerAccountDetailsDto) {

		return customerAccountDetailsService.updateCustomerAccountDetails(customerAccountDetailsDto);
	}

	@DeleteMapping(value = "/deletecustomer-details/{ID}", consumes = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public ResponseEntity<String> deleteCustomerAcountDetails(@PathVariable long ID) {

		customerAccountDetailsService.deleteCustomerAccountDetails(ID);
		
		
		return new ResponseEntity<>("Customer account details deleted sucessfully", HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/getbycustomer-detailsid/{id}", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public CustomerAccountDetails getcustomerAccountDetailsByCustomerId(@PathVariable int id) {

		return customerAccountDetailsService.getCustomerAccountDetailsByCustomerId(id);
	}

	@GetMapping(value = "/getallcustomer-details", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public List<CustomerAccountDetails> getAllCustomerAccountDetails() {

		return customerAccountDetailsService.getAllCustomerAccountDetails();
	}

}
