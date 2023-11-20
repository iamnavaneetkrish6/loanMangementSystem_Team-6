package com.hexaware.loanmanagementsystem.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.dto.CustomerDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.CustomerDetails;
import com.hexaware.loanmanagementsystem.service.CustomerDetailsServiceImp;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	CustomerDetailsServiceImp customerDetailsService;
	
	
	@PostMapping(value = "registration", consumes = "application/json", produces = "application/json")
	public CustomerDetails userRegistration(@RequestBody CustomerDetailsDTO customerDetailsDto)
	{

		return customerDetailsService.customerRegisteration(customerDetailsDto);
	}
	
	@PutMapping(value = "update-userdetails", consumes = "application/json", produces = "application/json")
	public CustomerDetails updateUserDetails(@RequestBody CustomerDetailsDTO customerDetailsDto)
	{

		return customerDetailsService.updateCustomerDetails(customerDetailsDto);
	}
	
	
	
}
