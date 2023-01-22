package com.codingz2m.springbootmutualfundservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.codingz2m.springbootmutualfundservice.config.MutualFundSchemeConfig;
import com.codingz2m.springbootmutualfundservice.model.MutualFundScheme;


// Annotation Based Configuration
@Service (value="balancedMFScheme")
@Primary
public class BalancedMutualFundScheme implements MutualFundService {

	MutualFundScheme mutualFundScheme;
	MutualFundSchemeConfig mtualFundSchemeConfig;
	
	
	// Constructor Injection
	public BalancedMutualFundScheme(MutualFundSchemeConfig mutualFundSchemeConfig) {
		this.mtualFundSchemeConfig = mutualFundSchemeConfig;
	}
	
	
	// Setter Injection
		@Autowired
		public void setMutualFundScheme(MutualFundScheme mutualFundScheme) {
			this.mutualFundScheme = mutualFundScheme;
		}


	@Override
	public MutualFundScheme mutualFundSchemeDetails() {
		
		List <String> schemeDescription  = mtualFundSchemeConfig.getList();
		
		schemeDescription.add(":: Balanced Mutual Fund Scheme Objectives ::");
		schemeDescription.add("Providing both growth and regular income");
		schemeDescription.add("Invested in equities and fixed income securities");
		
		mutualFundScheme.setSchemeDescription(schemeDescription);
		
		return mutualFundScheme;
	}


}
