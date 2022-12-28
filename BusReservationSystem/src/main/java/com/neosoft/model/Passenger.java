package com.neosoft.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tblPassenger")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	private String passengerName;
	private int passengerAge;
	private String passengerContact;
	private int seatNo;
	
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerContact() {
		return passengerContact;
	}
	public void setPassengerContact(String passengerContact) {
		this.passengerContact = passengerContact;
	}
	public int getSeatNo() {
		return seatNo;
	}
	
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
}
