package main.java.service.adapter;

import main.java.model.TravixRequest;
import main.java.service.supplier.model.CrazyAirRequest;

public class TravixToCrazyAirRequest implements Adapter<TravixRequest, CrazyAirRequest>{

	@Override
	public CrazyAirRequest adapt(TravixRequest travixRequest) {
		CrazyAirRequest CZRequest = new CrazyAirRequest();
		
		CZRequest.setDepartureDate(travixRequest.getDepartureDate().getCrazyAirRequestFormatDate());
		CZRequest.setReturnDate(travixRequest.getReturnDate().getCrazyAirRequestFormatDate());
		CZRequest.setDestination(travixRequest.getDestination());
		CZRequest.setNumberOfPassengers(travixRequest.getNumberOfPassengers());
		CZRequest.setOrigin(travixRequest.getOrigin());
		
		return CZRequest;
	}

}
