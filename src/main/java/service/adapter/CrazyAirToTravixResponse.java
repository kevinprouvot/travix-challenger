package main.java.service.adapter;

import main.java.model.FormattedDate;
import main.java.model.Money;
import main.java.model.TravixResponse;
import main.java.service.supplier.model.CrazyAirResponse;

public class CrazyAirToTravixResponse implements Adapter<CrazyAirResponse, TravixResponse>{

	@Override
	public TravixResponse adapt(CrazyAirResponse cZResponse) {
		TravixResponse travixResponse = new TravixResponse();
		
		travixResponse.setAirline(cZResponse.getAirline());
		travixResponse.setArrivalDate(FormattedDate.createFromCrazyAirResponse(cZResponse.getArrivalDate()));
		travixResponse.setDepartureAirportCode(cZResponse.getDepartureAirportCode());
		travixResponse.setDepartureDate(FormattedDate.createFromCrazyAirResponse(cZResponse.getDepartureDate()));
		travixResponse.setDestinationAirportCode(cZResponse.getDestinationAirportCode());
		travixResponse.setFare(new Money(cZResponse.getPrice()));
		travixResponse.setSupplier("Crazy Air");
		
		return travixResponse;
	}

	
}
