package main.java.service.adapter;

import main.java.model.FormattedDate;
import main.java.model.Money;
import main.java.model.TravixResponse;
import main.java.service.supplier.model.ToughJetResponse;

public class ToughJetToTravixResponse implements
		Adapter<ToughJetResponse, TravixResponse> {

	@Override
	public TravixResponse adapt(ToughJetResponse tJResponse) {
		TravixResponse travixResponse = new TravixResponse();

		travixResponse.setAirline(tJResponse.getCarrier());
		
		travixResponse.setArrivalDate(FormattedDate.createFromToughJetResponse(
				tJResponse.getReturnDay(), tJResponse.getReturnMonth(),
				tJResponse.getReturnYear()));
		
		travixResponse.setDepartureAirportCode(tJResponse
				.getDepartureAirportName());
		
		travixResponse.setDepartureDate(FormattedDate
				.createFromToughJetResponse(tJResponse.getDepartureDay(),
						tJResponse.getDepartureMonth(),
						tJResponse.getDepartureYear()));
		
		travixResponse.setDestinationAirportCode(tJResponse
				.getArrivalAirportName());
		
		travixResponse.setFare(new Money(tJResponse.getBasePrice(), tJResponse.getTax(), tJResponse.getDiscout()));
		
		travixResponse.setSupplier("Topugh Jet");
		
		return travixResponse;
	}

}
