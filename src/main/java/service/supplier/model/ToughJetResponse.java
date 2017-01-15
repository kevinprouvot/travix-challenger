package main.java.service.supplier.model;

import java.math.BigDecimal;

public class ToughJetResponse {
	
	private String carrier;
	private BigDecimal basePrice;
	private BigDecimal tax;
	// Pourcent
	private Integer discout;
	private String departureAirportName;
	private String arrivalAirportName;
	private Integer departureDay;
	private Integer departureMonth;
	private Integer departureYear;
	private Integer returnDay;
	private Integer returnMonth;
	private Integer returnYear;
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public BigDecimal getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public Integer getDiscout() {
		return discout;
	}
	public void setDiscout(Integer discout) {
		this.discout = discout;
	}
	public String getDepartureAirportName() {
		return departureAirportName;
	}
	public void setDepartureAirportName(String departureAirportName) {
		this.departureAirportName = departureAirportName;
	}
	public String getArrivalAirportName() {
		return arrivalAirportName;
	}
	public void setArrivalAirportName(String arrivalAirportName) {
		this.arrivalAirportName = arrivalAirportName;
	}
	public Integer getDepartureDay() {
		return departureDay;
	}
	public void setDepartureDay(Integer departureDay) {
		this.departureDay = departureDay;
	}
	public Integer getDepartureMonth() {
		return departureMonth;
	}
	public void setDepartureMonth(Integer departureMonth) {
		this.departureMonth = departureMonth;
	}
	public Integer getDepartureYear() {
		return departureYear;
	}
	public void setDepartureYear(Integer departureYear) {
		this.departureYear = departureYear;
	}
	public Integer getReturnDay() {
		return returnDay;
	}
	public void setReturnDay(Integer returnDay) {
		this.returnDay = returnDay;
	}
	public Integer getReturnMonth() {
		return returnMonth;
	}
	public void setReturnMonth(Integer returnMonth) {
		this.returnMonth = returnMonth;
	}
	public Integer getReturnYear() {
		return returnYear;
	}
	public void setReturnYear(Integer returnYear) {
		this.returnYear = returnYear;
	}
}
