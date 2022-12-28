package com.neosoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblDriver")
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int driverId;
	private String driverName;
	private String driverContact;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int driverId, String driverName, String driverContact) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverContact = driverContact;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverContact() {
		return driverContact;
	}
	
	public void setDriverContact(String driverContact) {
		this.driverContact = driverContact;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverContact=" + driverContact + "]";
	}
	
}