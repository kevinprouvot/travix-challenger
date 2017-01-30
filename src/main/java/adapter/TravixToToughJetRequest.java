package main.java.adapter;

import main.java.model.TravixRequest;
import main.java.service.supplier.model.ToughJetRequest;

public class TravixToToughJetRequest implements Adapter<TravixRequest, ToughJetRequest>{

	@Override
	public ToughJetRequest adapt(TravixRequest travixRequest) {
		ToughJetRequest tJRequest = new ToughJetRequest();
		
		tJRequest.setDepartureDay(travixRequest.getDepartureDate().getDayOfMonth());
		tJRequest.setDepartureMonth(travixRequest.getDepartureDate().getMonth());
		tJRequest.setDepartureYear(travixRequest.getDepartureDate().getYear());
		tJRequest.setFrom(travixRequest.getOrigin());
		tJRequest.setNumberOfAdults(travixRequest.getNumberOfPassengers());
		tJRequest.setReturnDay(travixRequest.getReturnDate().getDayOfMonth());
		tJRequest.setReturnMonth(travixRequest.getReturnDate().getMonth());
		tJRequest.setReturnYear(travixRequest.getReturnDate().getYear());
		tJRequest.setTo(travixRequest.getDestination());
		
		return tJRequest;
	}
	
	
}
