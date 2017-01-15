package main.java.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.controller.dto.FlightSearchDTO;

@RestController
public class FlightSearchController {

	@RequestMapping("/v1/search")
	public String search(HttpServletRequest request, FlightSearchDTO flightSearchDTO) {
		
		
		return "Work in progress";
	}
	
}
