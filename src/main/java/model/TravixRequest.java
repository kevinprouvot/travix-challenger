package main.java.model;

public class TravixRequest {

	private String origin;
	private String destination;
	private FormattedDate departureDate;
	private FormattedDate returnDate;
	private Integer numberOfPassengers;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public FormattedDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(FormattedDate departureDate) {
		this.departureDate = departureDate;
	}

	public FormattedDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(FormattedDate returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(Integer numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

}
