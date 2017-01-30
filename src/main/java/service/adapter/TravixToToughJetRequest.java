package main.java.service.adapter;

import main.java.model.TravixRequest;
import main.java.service.supplier.model.ToughJetRequest;

public class TravixToToughJetRequest implements Adapter<TravixRequest, ToughJetRequest>{

	@Override
	public ToughJetRequest adapt(TravixRequest travixRequest) {
		ToughJetRequest TJRequest = new ToughJetRequest();
		
		TJRequest.setDepartureDay(travixRequest.getDepartureDate().getDayOfMonth());
		TJRequest.setDepartureMonth(travixRequest.getDepartureDate().getMonth());
		TJRequest.setDepartureYear(travixRequest.getDepartureDate().getYear());
		TJRequest.setFrom(travixRequest.getOrigin());
		TJRequest.setNumberOfAdults(travixRequest.getNumberOfPassengers());
		TJRequest.setReturnDay(travixRequest.getReturnDate().getDayOfMonth());
		TJRequest.setReturnMonth(travixRequest.getReturnDate().getMonth());
		TJRequest.setReturnYear(travixRequest.getReturnDate().getYear());
		TJRequest.setTo(travixRequest.getDestination());
		
		return TJRequest;
	}
	
	
}
