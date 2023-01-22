package com.codingz2m.springbootmutualfundservice.service;

import org.springframework.stereotype.Service;

import com.codingz2m.springbootmutualfundservice.model.MutualFundParameters;
import com.codingz2m.springbootmutualfundservice.model.MutualFundScheme;

@Service (value="mutualFundBasics")
public class MutualFundBasics implements MutualFundService {

	private MutualFundParameters mutualFundParameters;
	
	
	public MutualFundBasics(MutualFundParameters mutualFundParameters) {
		this.mutualFundParameters = mutualFundParameters;
	}

	@Override
	public MutualFundScheme mutualFundSchemeDetails() {
		return null;
	}

	public MutualFundParameters mutualFundTerms() {
		
		mutualFundParameters.setNetAssetValue("Market value per unit of mutual funds");
		mutualFundParameters.setExpenseRatio("Operational charges as mutual funds");
		mutualFundParameters.setExitLoad("Premature exit from the fund");
		mutualFundParameters.setAssetsUnderManagement("Total assets that are being managed by a mutual fund scheme");
		mutualFundParameters.setRiskLevel("How much risk the particular scheme entail");
		mutualFundParameters.setPortfolioTurnoverRatio("Defines how frequently the mutual fund manger buys or sells the stocks from the fund");
		mutualFundParameters.setQuantitativeMeasures("Gives an idea of the risk taken by the mutual fund and the volatility you can expect in your returns");
		mutualFundParameters.setPortfolio("The stocks the mutual fund has invested in and the sectors( percentage of Total Holdings)it has more exposure to");
		
		return mutualFundParameters;
	}
}
