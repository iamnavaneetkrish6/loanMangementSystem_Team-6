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

import com.hexaware.loanmanagementsystem.dto.LoanApplyDetailsDTO;
import com.hexaware.loanmanagementsystem.entity.LoanApplyDetails;
import com.hexaware.loanmanagementsystem.service.ILoanApplyDetailsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/loan-apply-details/")
public class LoanApplyDetailsRestController {

	@Autowired
	ILoanApplyDetailsService loanApplyDetailsService;
	
	
	@PostMapping(value = "/addloan", consumes = "application/json", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public LoanApplyDetails createLoanApplyDetails(@RequestBody @Valid LoanApplyDetailsDTO loanApplyDetailsDto) {

		return loanApplyDetailsService.createLoanApplyDetails(loanApplyDetailsDto);
	}

	@PutMapping(value = "/updateloan", consumes = "application/json", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public LoanApplyDetails updateLoanApplyDetails(@RequestBody @Valid LoanApplyDetailsDTO loanApplyDetailsDto) {

		return loanApplyDetailsService.updateApplyDetails(loanApplyDetailsDto);
	}

	@DeleteMapping(value = "/deleteloan/{ID}", consumes = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_USER')")
	public ResponseEntity<String> deleteLoanApplyDetailsById(@PathVariable long ID) {
		loanApplyDetailsService.deleteApplyDetails(ID);


		return new ResponseEntity<>("Loan Details deleted sucessfully", HttpStatus.ACCEPTED);
	
	}

	@GetMapping(value = "/getbyloannumber/{loanNo}", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public LoanApplyDetails getLoanApplyDetailsByLoanNumber(@PathVariable int loanNo) {

		return loanApplyDetailsService.getloanDetailsByLoanNumber(loanNo);
	}

	@GetMapping(value = "/getAllloan", produces = "application/json")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public List<LoanApplyDetails> getAllLoanApplyDetails() {

		return loanApplyDetailsService.getAllLoanDetails();
	}
	
}
