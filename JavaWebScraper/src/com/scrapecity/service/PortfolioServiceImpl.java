package com.scrapecity.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrapecity.dao.PortfolioDAO;
import com.scrapecity.entity.Portfolio;

@Service
public class PortfolioServiceImpl implements PortfolioService {

	// need to inject portfolio dao
	@Autowired
	private PortfolioDAO portfolioDAO;
	
	@Override
	@Transactional
	public List<Portfolio> getPortfolio() {
		return portfolioDAO.getPortfolio();
	}

	@Override
	@Transactional
	public void savePortfolio(Portfolio thePortfolio) {
		portfolioDAO.savePortfolio(thePortfolio);
	}

}
