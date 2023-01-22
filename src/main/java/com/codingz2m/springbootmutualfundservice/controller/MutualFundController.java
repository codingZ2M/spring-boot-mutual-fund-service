package com.codingz2m.springbootmutualfundservice.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingz2m.springbootmutualfundservice.model.MutualFundParameters;
import com.codingz2m.springbootmutualfundservice.model.MutualFundScheme;
import com.codingz2m.springbootmutualfundservice.service.MutualFundService;


//Annotation Based Configuration
@RestController // Routes the requests the user types
@RequestMapping(value = "/mutualfund-scheme")
public class MutualFundController {
	
	MutualFundService mutualFundSchemeService;
	MutualFundService mutualFundBasics;
	

	// Constructor Injection
	public MutualFundController(@Qualifier ("balancedMFScheme") MutualFundService mutualFundSchemeService,
			@Qualifier("mutualFundBasics")  MutualFundService mutualFundBasics) {
		this.mutualFundSchemeService = mutualFundSchemeService;
		this.mutualFundBasics = mutualFundBasics;
	}



	@GetMapping
	public ResponseEntity<MutualFundScheme>  mutualFundDetailsHandler(){
			  
		MutualFundScheme mutualFundScheme = mutualFundSchemeService.mutualFundSchemeDetails();
	 //HTTP status return code for a successful find statement        
	   return new ResponseEntity<MutualFundScheme>(mutualFundScheme, HttpStatus.FOUND); 
	
	 }

	@GetMapping(value="/terms")
	public ResponseEntity<MutualFundParameters>  mutualFundTerms(){
		MutualFundParameters mutualFundParameters = mutualFundBasics.mutualFundTerms();
		
		return new ResponseEntity<MutualFundParameters>(mutualFundParameters, HttpStatus.FOUND); 
	
	 }


	
	
}
