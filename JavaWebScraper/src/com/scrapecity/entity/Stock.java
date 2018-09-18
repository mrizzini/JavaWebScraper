package com.scrapecity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {

	// NEED TO ADD GETTERS/SETTER
	// NEED TO FIGURE OUT FORMAT 
	// NEED TO ACCOUNT FOR VIRTUAL
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
    private int Id;

	@Column(name="stock_symbol")
    private String StockSymbol;
    
//    [DataType(DataType.Currency)]
	@Column(name="current_price")
    private double CurrentPrice;
    
//    [DataType(DataType.Currency)]
	@Column(name="change_by_dollar")
    private double ChangeByDollar;
    
//    [DisplayFormat(DataFormatString = "{0:P2}")]
	@Column(name="change_by_percent")
    private double ChangeByPercent;
    
	@Column(name="shares")
    private double Shares;
    
//    [DataType(DataType.Currency)]   
	@Column(name="cost_basis")
    private double CostBasis;
    
//    [DataType(DataType.Currency)]
	@Column(name="market_value")
    private double MarketValue;
    
//    [DataType(DataType.Currency)]
	@Column(name="day_gain_by_dollar")
    private double DayGainByDollar;
    
//    [DisplayFormat(DataFormatString = "{0:P2}")]
	@Column(name="day_gain_by_percent")
    private double DayGainByPercent;

//    [DataType(DataType.Currency)]
	@Column(name="total_gain_by_dollar")
    private double TotalGainByDollar;
    
//    [DisplayFormat(DataFormatString = "{0:P2}")]
	@Column(name="total_gain_by_percent")
    private double TotalGainByPercent;     
    
	@Column(name="lots")
    private double Lots;
    
	@Column(name="notes")
    private String Notes;
	
//  private virtual Portfolio Portfolio
	
	public Stock() {
		
	}
	
	public Stock(int id, String stockSymbol, double currentPrice, double changeByDollar, double changeByPercent,
		double shares, double costBasis, double marketValue, double dayGainByDollar, double dayGainByPercent,
		double totalGainByDollar, double totalGainByPercent, double lots, String notes) {
	super();
	Id = id;
	StockSymbol = stockSymbol;
	CurrentPrice = currentPrice;
	ChangeByDollar = changeByDollar;
	ChangeByPercent = changeByPercent;
	Shares = shares;
	CostBasis = costBasis;
	MarketValue = marketValue;
	DayGainByDollar = dayGainByDollar;
	DayGainByPercent = dayGainByPercent;
	TotalGainByDollar = totalGainByDollar;
	TotalGainByPercent = totalGainByPercent;
	Lots = lots;
	Notes = notes;
}

	@Override
	public String toString() {
		return "Stock [Id=" + Id + ", StockSymbol=" + StockSymbol + ", CurrentPrice=" + CurrentPrice
				+ ", ChangeByDollar=" + ChangeByDollar + ", ChangeByPercent=" + ChangeByPercent + ", Shares=" + Shares
				+ ", CostBasis=" + CostBasis + ", MarketValue=" + MarketValue + ", DayGainByDollar=" + DayGainByDollar
				+ ", DayGainByPercent=" + DayGainByPercent + ", TotalGainByDollar=" + TotalGainByDollar
				+ ", TotalGainByPercent=" + TotalGainByPercent + ", Lots=" + Lots + ", Notes=" + Notes + "]";
	}
    

	
}
