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
@Table(name="tblBus")
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busId;
	private String busPlateNo;
	private String busType;
	private int capacity;
	private String source;
	private String destination;
	private String scheduleDate;
	private String departureTime;
	private String estimatedArrivalTime;
	private double fareAmount;
	private String remark;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "driverId")
	
	private Driver driver;

	
	public Driver getDriver() {
		return driver;
	}
	

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusPlateNo() {
		return busPlateNo;
	}

	public void setBusPlateNo(String busPlateNo) {
		this.busPlateNo = busPlateNo;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}

	public void setEstimatedArrivalTime(String estimatedArrivalTime) {
		this.estimatedArrivalTime = estimatedArrivalTime;
	}

	public double getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(double fareAmount) {
		this.fareAmount = fareAmount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}