package com.codingz2m.springbootmutualfundservice.service;

import com.codingz2m.springbootmutualfundservice.model.MutualFundParameters;
import com.codingz2m.springbootmutualfundservice.model.MutualFundScheme;

public interface MutualFundService {
	
	MutualFundScheme mutualFundSchemeDetails();
	
	default MutualFundParameters mutualFundTerms() {
		
		return new MutualFundParameters();
	}

}
	
