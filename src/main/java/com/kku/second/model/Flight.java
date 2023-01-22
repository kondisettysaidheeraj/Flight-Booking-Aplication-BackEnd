package com.kku.second.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Flight")
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FLIGHT_ID")
	private int flightId;
	@Column(name="OPERATING_AIRLINES")
	private String  operatingAirline;
	@Column(name="SOURCE")
	private String source;
	@Column(name="DESTINATION")
	private String destination;   
	@Column(name="ARRIVAL_DATE")
	private String arrivalDate;
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFlightId() {
		return flightId;
	}
	
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getOperatingAirline() {
		return operatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	

	
	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	
	
}
