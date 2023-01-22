package com.kku.second.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FlightPrice")
public class FlightPrice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Flight_Id")
	private int flightId;
	@Column(name="seat_Type")
	private String seatType;
	@Column(name="Price")
	private  float price;
	@Column(name="Capacity")
	private String capacity;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	

}
