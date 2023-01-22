package com.kku.second.service;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kku.second.model.Flight;
import com.kku.second.repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	FlightRepository flightrepo;

	public Flight addFlight(Flight flight) {
		return flightrepo.save(flight);
		
	}

	
		
	public List<Flight> findFlights(String from, String to, String departureDate ) {
		List<Flight> flights = flightrepo.findFlights(from, to, departureDate);
		
//		if(flights.size()==0)
//		return flightsEmpty;
		
		return flights;
	}



	
	

}
