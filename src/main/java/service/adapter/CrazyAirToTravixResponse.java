package main.java.service.adapter;

import main.java.model.FormattedDate;
import main.java.model.Money;
import main.java.model.TravixResponse;
import main.java.service.supplier.model.CrazyAirResponse;

public class CrazyAirToTravixResponse implements Adapter<CrazyAirResponse, TravixResponse>{

	@Override
	public TravixResponse adapt(CrazyAirResponse CZResponse) {
		TravixResponse travixResponse = new TravixResponse();
		
		travixResponse.setAirline(CZResponse.getAirline());
		travixResponse.setArrivalDate(FormattedDate.createFromCrazyAirResponse(CZResponse.getArrivalDate()));
		travixResponse.setDepartureAirportCode(CZResponse.getDepartureAirportCode());
		travixResponse.setDepartureDate(FormattedDate.createFromCrazyAirResponse(CZResponse.getDepartureDate()));
		travixResponse.setDestinationAirportCode(CZResponse.getDestinationAirportCode());
		travixResponse.setFare(new Money(CZResponse.getPrice()));
		travixResponse.setSupplier("Crazy Air");
		
		return travixResponse;
	}

	
}
