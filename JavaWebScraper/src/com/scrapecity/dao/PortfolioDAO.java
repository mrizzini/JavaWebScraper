package com.scrapecity.dao;

import java.util.List;

import com.scrapecity.entity.Portfolio;

public interface PortfolioDAO {

	public List<Portfolio> getPortfolio();

	public void savePortfolio(Portfolio thePortfolio);
	
}
