package main.java.service.adapter;

import main.java.model.TravixRequest;
import main.java.service.supplier.model.CrazyAirRequest;

public class TravixToCrazyAirRequest implements Adapter<TravixRequest, CrazyAirRequest>{

	@Override
	public CrazyAirRequest adapt(TravixRequest travixRequest) {
		CrazyAirRequest cZRequest = new CrazyAirRequest();
		
		cZRequest.setDepartureDate(travixRequest.getDepartureDate().getCrazyAirRequestFormatDate());
		cZRequest.setReturnDate(travixRequest.getReturnDate().getCrazyAirRequestFormatDate());
		cZRequest.setDestination(travixRequest.getDestination());
		cZRequest.setNumberOfPassengers(travixRequest.getNumberOfPassengers());
		cZRequest.setOrigin(travixRequest.getOrigin());
		
		return cZRequest;
	}

}
