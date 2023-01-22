package com.kku.second.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kku.second.model.Flight;
import com.kku.second.model.Passenger;
import com.kku.second.model.Reservation;
import com.kku.second.service.ReservationService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/flightreservation")
public class ReservationController {

	@Autowired
	ReservationService reservationService;
	
	@PostMapping("/bookflight")
	public Reservation bookFlight(@RequestBody Reservation reservation) {
		return reservationService.bookFlight(reservation);
	} 
	
	@GetMapping("/getFlightByReservationId")
	public Flight getFlightByReservationId(@RequestParam int reservationId)
	{
	     return reservationService.getFlightByReservationId(reservationId);
	    
	}
	@GetMapping("/getPassengerByReservationId")
	public Passenger  getPassengerByReservationId(@RequestParam int reservationId)
	{
		return reservationService.getPassengerByReservationId(reservationId);
	}
	

}
