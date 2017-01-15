package main.java.service.supplier.model;

public class ToughJetRequest {
	
	private String from;
	private String to;
	private Integer departureDay;
	private Integer departureMonth;
	private Integer departureYear;
	private Integer returnDay;
	private Integer returnMonth;
	private Integer returnYear;
	private Integer numberOfAdults;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
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
	public Integer getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(Integer numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
}
