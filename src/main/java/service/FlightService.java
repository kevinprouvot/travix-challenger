package main.java.service;

import main.java.adapter.AdapterFactory;
import main.java.model.TravixRequest;
import main.java.model.TravixResponse;
import main.java.service.supplier.CrazyAirRestService;
import main.java.service.supplier.ToughJetRestService;
import main.java.service.supplier.exception.GenericRestException;
import main.java.service.supplier.model.CrazyAirRequest;
import main.java.service.supplier.model.CrazyAirResponse;
import main.java.service.supplier.model.ToughJetRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	
	@Autowired
	private CrazyAirRestService crazyAirRestService;
	
	@Autowired
	private ToughJetRestService toughJetRestService;
	
	@Autowired
	private AdapterFactory adapterFactory;
	
	public TravixResponse searchForFlight(TravixRequest request) {
		try {
			CrazyAirRequest crazyAirRequest = adapterFactory.adaptFromTo(request, CrazyAirRequest.class);
			CrazyAirResponse crazyAirResponse = crazyAirRestService.getCrazyAirResponse(crazyAirRequest);
			
			ToughJetRequest toughJetRequest = adapterFactory.adaptFromTo(request, ToughJetRequest.class);
			
		}
		catch (GenericRestException e) {
			
		}
	}
	
}
