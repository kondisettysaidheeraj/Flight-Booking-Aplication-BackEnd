package com.kku.second.model;

import java.security.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="reservation_Id")
	private int reservationId;

	
//	private Boolean checkedIn;
//	private int numberOfBags;
	@Column(name="flight_Id")
	private int flightId;
	@OneToOne
	private Passenger passenger;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="flight_fk")
//	private Flight flightId;
	
//	private Timestamp created;
	

	

//	public Boolean getCheckedIn() {
//		return checkedIn;
//	}
//
//	public void setCheckedIn(Boolean checkedIn) {
//		this.checkedIn = checkedIn;
//	}
//
//	public int getNumberOfBags() {
//		return numberOfBags;
//	}
//
//	public void setNumberOfBags(int numberOfBags) {
//		this.numberOfBags = numberOfBags;
//	}
	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	//	public Timestamp getCreated() {
//		return created;
//	}
//
//	public void setCreated(Timestamp created) {
//		this.created = created;
//	}



}
