package com.kku.second.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Transaction_Id")
	private int transactionId;
	@Column(name="User_Id")
	private int userId;
	@Column(name="Payement_Method")
	private float payementMethod;
	@Column(name="Price")
	private float price;
	@Column(name="Status")
	private boolean status;
	@Column(name="Date")
	private Date date;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getPayementMethod() {
		return payementMethod;
	}
	public void setPayementMethod(float payementMethod) {
		this.payementMethod = payementMethod;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
