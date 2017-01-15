package main.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightSearchController {

	@RequestMapping("/")
	public String search() {
		return "Work in progress";
	}
	
}
