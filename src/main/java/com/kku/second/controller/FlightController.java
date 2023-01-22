package com.kku.second.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kku.second.model.Flight;
import com.kku.second.repository.FlightRepository;
import com.kku.second.service.FlightService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/flightreservation")
public class FlightController {
	@Autowired
	FlightService flightService;
	
	@PostMapping("/addFlight")
	public Flight   addFlight(@RequestBody Flight flight)
	{
		return flightService.addFlight(flight);
	
	}
	
	@GetMapping("/findflights")
	public List<Flight> findFlights(@RequestParam String arrivalCity,
			@RequestParam  String departureCity,
			@RequestParam  String  arrivalDate) {
		return flightService.findFlights(arrivalCity, departureCity, arrivalDate);
	}
	
	
	

}
