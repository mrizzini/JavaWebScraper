package com.scrapecity.service;

import java.util.List;

import com.scrapecity.entity.Portfolio;

public interface PortfolioService {

	public List<Portfolio> getPortfolio();

	public void savePortfolio(Portfolio thePortfolio);
	
}
