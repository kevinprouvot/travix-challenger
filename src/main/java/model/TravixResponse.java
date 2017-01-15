package main.java.model;

public class TravixResponse {

	private String airline;
	private String supplier;
	private Money fare;
	private String departureAirportCode;
	private String destinationAirportCode;
	private FormattedDate departureDate;
	private FormattedDate arrivalDate;

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Money getFare() {
		return fare;
	}

	public void setFare(Money fare) {
		this.fare = fare;
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

	public FormattedDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(FormattedDate departureDate) {
		this.departureDate = departureDate;
	}

	public FormattedDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(FormattedDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
}
