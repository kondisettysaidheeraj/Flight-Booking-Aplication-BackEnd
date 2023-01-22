package com.kku.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kku.second.model.FlightPrice;

public interface FlightPriceRepository extends JpaRepository<FlightPrice,Integer> {

}
