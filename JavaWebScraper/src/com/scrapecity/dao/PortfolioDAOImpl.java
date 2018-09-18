package com.scrapecity.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scrapecity.entity.Portfolio;

@Repository
public class PortfolioDAOImpl implements PortfolioDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
//	@Transactional - removed when we introduced Service layer. Service will manage this
	public List<Portfolio> getPortfolio() {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Portfolio> theQuery = currentSession.createQuery("from Portfolio", Portfolio.class);
		
		// execute query and get result list
		List<Portfolio> portfolio = theQuery.getResultList();
		
		// return the results
		return portfolio;
		
	
	}


	@Override
	public void savePortfolio(Portfolio thePortfolio) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save the customer
		currentSession.save(thePortfolio);
		
		//
		
	}

}
