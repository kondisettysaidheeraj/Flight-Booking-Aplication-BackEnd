package com.kku.second.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Booking_Id")
	private int bookingId;
	@Column(name="Flight_Id")
	private int flightId;
	@Column(name="User_Id")
	private int userId;
	@Column(name="Booking_Date")
	private Date bookingDate;
	@Column(name="transaction_Date")
	private Date transactionDate;

}
