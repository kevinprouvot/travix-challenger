package main.java.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Money {
	
	private BigDecimal amount;
	// TODO transform currency into enum 
	private String currency;
	
	public Money(BigDecimal amount) {
		this.amount = amount;
		this.currency = "£";
		amount.setScale(2, RoundingMode.UP);
	}
	
	public Money(BigDecimal basePrice, BigDecimal tax, Integer discount) {
		this.amount = basePrice.add(tax);
		BigDecimal discountPourcent = new BigDecimal(discount * 0.01);
		this.amount.multiply(discountPourcent);
		this.currency = "£";
		amount.setScale(2, RoundingMode.UP);
	}
	
	public Money(String price) {
		try {
			this.amount = (BigDecimal)DecimalFormat.getInstance().parse(price);
			this.currency = "£";
			amount.setScale(2, RoundingMode.UP);
		}
		catch (ParseException e) {
			//TODO Propagate and handle ParseException 
		}
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	
	
}
