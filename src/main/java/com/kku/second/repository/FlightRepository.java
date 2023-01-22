package com.kku.second.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kku.second.model.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer> {

//	List<Flight> findFlights(String from, String to, Date departureDate);
	
	@Query("from Flight where source=:departureCity and "
			+ "destination=:arrivalCity and arrivalDate=:arrivalDate")
	List<Flight> findFlights(@Param("departureCity") String from,
			@Param("arrivalCity") String to,
			@Param("arrivalDate")   String arrivalDate);
	
	@Query(value="select * from flight where flight_id=(select flight_id from reservation where reservation_id=:rId)",nativeQuery=true)
	public Flight getFlightByReservationId(@Param("rId") int reservaitonId);
	
	
	


}
