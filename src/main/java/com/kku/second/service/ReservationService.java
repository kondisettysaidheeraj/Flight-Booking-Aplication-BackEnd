package com.kku.second.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kku.second.model.Flight;
import com.kku.second.model.Passenger;
import com.kku.second.model.Reservation;
import com.kku.second.repository.FlightRepository;
import com.kku.second.repository.PassengerRepository;
import com.kku.second.repository.ReservationRepository;
@Service
public class ReservationService {
	@Autowired
	ReservationRepository reservationrepo;
	
	@Autowired
	FlightRepository flightrepo;
	@Autowired
	PassengerRepository passengerrepo;

	public Reservation bookFlight(Reservation reservation) {
		
Reservation res = null;
		
		// Get the flight information
//	    int flightNumber = reservation.getFlightId().getFlightId();
//		Optional<Flight> flight = flightrepo.findById(flightNumber);
		
		// Insert passenger details in passenger Table
		Passenger passenger = reservation.getPassenger();
		passengerrepo.save(passenger);
		
//		reservation.setPassenger(passenger);
		
//		if(flight.isPresent() && !flight.isEmpty()) {
//		reservation.setFlight(flight.get());
//		}

		// Insert reservation details in reservation Table
		res = reservationrepo.save(reservation);
		return res;
		
		

		}
	  
	public Flight  getFlightByReservationId(int reservationId)
	{
		return flightrepo.getFlightByReservationId(reservationId);
	
	}
public  Passenger  getPassengerByReservationId( int reservationId) 
{
  return  passengerrepo.getPassengerByReservationId(reservationId);

}
}
