package com.scrapecity.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="portfolio")
public class Portfolio {

	// NEED TO FIGURE OUT DISPLAY FORMATTING
	
	public Portfolio(double totalValue, double dayGain, double dayGainPercent, double totalGain,
			double totalGainPercent, String userId) {
		Date = Calendar.getInstance().getTime();
		TotalValue = totalValue;
		DayGain = dayGain;
		DayGainPercent = dayGainPercent;
		TotalGain = totalGain;
		TotalGainPercent = totalGainPercent;
		UserId = userId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id; 

//	    [DataType(DataType.Date)]
	@Column(name = "date")
    private Date Date;

//    [DataType(DataType.Currency)
	@Column(name="total_value")
    private double TotalValue;

//    [DataType(DataType.Currency)]
	@Column(name="day_gain")
    private double DayGain;

//    [DisplayFormat(DataFormatString = "{0:P2}")]
	@Column(name="day_gain_percent")
    private double DayGainPercent;

//    [DataType(DataType.Currency)]
	@Column(name="total_gain")
    private double TotalGain;

//    [DisplayFormat(DataFormatString = "{0:P2}")]
	@Column(name="total_gain_percent")
    private double TotalGainPercent;

	@Column(name="user_id")
    private String UserId;
    
//    public virtual List<Stock> Stocks { get; set; }
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public double getTotalValue() {
		return TotalValue;
	}

	public void setTotalValue(double totalValue) {
		TotalValue = totalValue;
	}

	public double getDayGain() {
		return DayGain;
	}

	public void setDayGain(double dayGain) {
		DayGain = dayGain;
	}

	public double getDayGainPercent() {
		return DayGainPercent;
	}

	public void setDayGainPercent(double dayGainPercent) {
		DayGainPercent = dayGainPercent;
	}

	public double getTotalGain() {
		return TotalGain;
	}

	public void setTotalGain(double totalGain) {
		TotalGain = totalGain;
	}

	public double getTotalGainPercent() {
		return TotalGainPercent;
	}

	public void setTotalGainPercent(double totalGainPercent) {
		TotalGainPercent = totalGainPercent;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}
	
	public Portfolio() {
		
	}

//	@Override
//	public String toString() {
//		return "Portfolio [Id=" + Id + ", TotalValue=" + TotalValue + ", DayGain=" + DayGain + ", DayGainPercent="
//				+ DayGainPercent + ", TotalGain=" + TotalGain + ", TotalGainPercent=" + TotalGainPercent + ", UserId="
//				+ UserId + "]";
//	}
	
	@Override
	public String toString() {
		return "Portfolio [Id=" + Id + ", Date=" + Date + ", TotalValue=" + TotalValue + ", DayGain=" + DayGain
				+ ", DayGainPercent=" + DayGainPercent + ", TotalGain=" + TotalGain + ", TotalGainPercent="
				+ TotalGainPercent + ", UserId=" + UserId + "]";
	}
	
}
