package main.java.model;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormattedDate {

	private LocalDate localDate;

	private static final DateTimeFormatter iso8601Formatter = DateTimeFormatter.ISO_DATE;

	private static final DateTimeFormatter crazyAirResponseDateFormatter = DateTimeFormatter
			.ofPattern("mm-dd-yyyy HH:MM:ss").withZone(ZoneId.of("GMT"));

	private static final DateTimeFormatter crazyAirRequestDateFormatter = DateTimeFormatter.ofPattern("mm-dd-yyyy")
			.withZone(ZoneId.of("GMT"));
	
	// Prevent creating Date without using static methods
	private FormattedDate(LocalDate date) {
		this.localDate = date;
	}

	public static FormattedDate createDateFromIso8601(String formattedDate) {
		LocalDate date = LocalDate.parse(formattedDate, iso8601Formatter);

		return new FormattedDate(date);
	}

	// TODO create a method which take a ToughJet/CrazyAir responseDTO

	public static FormattedDate createFromCrazyAirResponse(String crazyAirResponseDate) {
		LocalDate date = LocalDate.parse(crazyAirResponseDate, crazyAirResponseDateFormatter);

		return new FormattedDate(date);
	}

	public static FormattedDate createFromToughJetResponse(int dayOfMonth, int month, int year) {
		LocalDate date = LocalDate.of(year, month, dayOfMonth);

		return new FormattedDate(date);
	}

	public String getIso8601Date() {
		return localDate.format(iso8601Formatter);
	}

	public String getCrazyAirRequestFormatDate() {
		return localDate.format(crazyAirRequestDateFormatter);
	}

	public int getDayOfMonth() {
		return localDate.getDayOfMonth();
	}

	public int getMonth() {
		return localDate.getMonthValue();
	}

	public int getYear() {
		return localDate.getYear();
	}
}
