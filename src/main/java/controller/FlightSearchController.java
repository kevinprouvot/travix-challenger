package main.java.controller;

import javax.servlet.http.HttpServletRequest;

import main.java.model.TravixRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightSearchController {

	@RequestMapping("/v1/search")
	public String search(HttpServletRequest request, TravixRequest travixRequest) {
		
		
		return "Work in progress";
	}
	
}
