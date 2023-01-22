package com.kku.second.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kku.second.model.Booking;


public interface BookingRepository extends JpaRepository<Booking,Integer> {
	

}
