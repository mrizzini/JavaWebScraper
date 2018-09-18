package com.scrapecity.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scrapecity.dao.PortfolioDAO;
import com.scrapecity.entity.Portfolio;
import com.scrapecity.service.PortfolioService;

@Controller
@RequestMapping("/portfolio")
public class PortfolioController {
	
	// need to inject the portfolio dao
//	// dependency injection
//	@Autowired
//	private PortfolioDAO portfolioDAO; - removed when we created service layer
	
	// inject portfolio service now instead
	@Autowired
	private PortfolioService portfolioService;

	@GetMapping("/list")
	public String listPortfolio(Model theModel) {
		
		// get portfolio from the dao
		List<Portfolio> thePortfolio = portfolioService.getPortfolio();
		
		// add portfolio to the model
		theModel.addAttribute("portfolio", thePortfolio);
		
		return "list-portfolio";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Portfolio thePortfolio = new Portfolio();
		
		theModel.addAttribute("portfolio", thePortfolio);
		
		return "portfolio-form";
	}
	
    @PostMapping("/savePortfolio")
    public String savePortfolio(@ModelAttribute("portfolio") Portfolio thePortfolio) {
 
    	// manually entering fields to test
    	
    	int id;
    	Date date = new Date();
    	System.out.println("DATE FIRST IS " + date);
    	double totalValue;
    	double dayGain;
    	double dayGainPercent;
    	double totalGain;
    	double totalGainPercent;
    	
    	id = 10;
//    	String dateString = "16/09/2018";
//    	try {
//			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("CATCH CATCH CATCH");
//			e.printStackTrace();
//		}
    	totalValue = 100000;
    	dayGain = 2340.87;
    	dayGainPercent = .03;
    	totalGain = 7893.20;
    	totalGainPercent = 1.32;
    	
    	Portfolio stockPortfolio = new Portfolio();
    	stockPortfolio.setId(id);
    	stockPortfolio.setDate(date);
    	System.out.println("DATE NOW IS " + stockPortfolio.getDate());
		stockPortfolio.setTotalValue(totalValue);
		stockPortfolio.setDayGain(dayGain);
		stockPortfolio.setDayGainPercent(dayGainPercent);
		stockPortfolio.setTotalGain(totalGain);
		stockPortfolio.setTotalGainPercent(totalGainPercent);
    	
    	
    	// save the customer using our service
    	portfolioService.savePortfolio(stockPortfolio);
    	
        return "redirect:/portfolio/list";
    }
}
