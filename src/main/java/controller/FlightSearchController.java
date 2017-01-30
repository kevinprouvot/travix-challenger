package main.java.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import main.java.model.TravixRequest;
import main.java.model.TravixResponse;
import main.java.service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightSearchController {

	@Autowired
	private FlightService flightService;
	
	@RequestMapping("/v1/search")
	public List<TravixResponse> search(HttpServletRequest request, TravixRequest travixRequest) {
		
		return flightService.searchForFlight(travixRequest);
	}
	
}
