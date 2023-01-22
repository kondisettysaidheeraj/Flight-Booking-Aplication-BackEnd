package com.kku.second.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kku.second.model.Flight;
import com.kku.second.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Integer>{
	
	@Query(value="select * from passenger where passenger_id=(select passenger_passenger_id from reservation where reservation_id=:rId)",nativeQuery=true)
	public  Passenger getPassengerByReservationId(@Param("rId") int reservaitonId);

}
