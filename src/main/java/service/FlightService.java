package main.java.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import main.java.adapter.AdapterFactory;
import main.java.model.TravixRequest;
import main.java.model.TravixResponse;
import main.java.service.supplier.CrazyAirRestService;
import main.java.service.supplier.ToughJetRestService;
import main.java.service.supplier.exception.GenericRestException;
import main.java.service.supplier.model.CrazyAirRequest;
import main.java.service.supplier.model.CrazyAirResponse;
import main.java.service.supplier.model.ToughJetRequest;
import main.java.service.supplier.model.ToughJetResponse;

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

	public List<TravixResponse> searchForFlight(TravixRequest request) {
		List<TravixResponse> adaptedCAresponses = new ArrayList<TravixResponse>();
		
		try {
			CrazyAirRequest crazyAirRequest = adapterFactory.adaptFromTo(
					request, CrazyAirRequest.class);
			
			List<CrazyAirResponse> crazyAirResponses = crazyAirRestService
					.getCrazyAirResponse(crazyAirRequest);

			adaptedCAresponses = crazyAirResponses
					.stream()
					.map(czResponse -> adapterFactory.adaptFromTo(czResponse,
							TravixResponse.class)).collect(Collectors.toList());
			
		} catch (GenericRestException e) {
			//TODO handle recovery method
		}
		
		List<TravixResponse> adaptedTJresponses = new ArrayList<TravixResponse>();
		
		try {

			ToughJetRequest toughJetRequest = adapterFactory.adaptFromTo(
					request, ToughJetRequest.class);
			
			List<ToughJetResponse> toughJetResponses = toughJetRestService
					.getToughjetResponse(toughJetRequest);

			adaptedTJresponses = toughJetResponses
					.stream()
					.map(tjResponse -> adapterFactory.adaptFromTo(tjResponse,
							TravixResponse.class)).collect(Collectors.toList());
			
		} catch (GenericRestException e) {
			//TODO handle recovery method
		}
		
		List<TravixResponse> responses = new ArrayList<TravixResponse>();
		responses.addAll(adaptedCAresponses);
		responses.addAll(adaptedTJresponses);
		
		return responses;

	}

}
