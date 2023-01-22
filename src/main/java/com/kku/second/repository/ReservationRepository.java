package com.kku.second.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kku.second.model.Flight;
import com.kku.second.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {

	
	
//	@Query(value="select flight_id from reservation where reservation_id=:rId",nativeQuery=true)
//	public int getFlightIdByReservationId(@Param("rId") int reservaitonId);
//   	
//	@Query(value="select passenger_passenger_id from reservation where reservation_id=:rId",nativeQuery=true)
//	public int getPassengerIdByReservationId(@Param("rId") int reservaitonId);
//	


   	

}
