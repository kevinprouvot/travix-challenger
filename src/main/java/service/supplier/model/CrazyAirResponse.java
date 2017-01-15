package main.java.service.supplier.model;

import java.math.BigDecimal;

public class CrazyAirResponse {
	
	private String airline;
	private BigDecimal price;
	private String cabinlass;
	private String departureAirportCode;
	private String destinationAirportCode;
	private String departureDate;
	private String arrivalDate;
	
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCabinlass() {
		return cabinlass;
	}
	public void setCabinlass(String cabinlass) {
		this.cabinlass = cabinlass;
	}
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
}
