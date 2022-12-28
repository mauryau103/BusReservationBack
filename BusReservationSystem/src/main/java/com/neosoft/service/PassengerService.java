package com.neosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Passenger;
import com.neosoft.repository.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepository passengerRepository;
	

	public Passenger addPassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}
	
	public String deletePassenger(int passengerId) {
		passengerRepository.deleteById(passengerId);
		return "Passenger with "+passengerId+" got deleted";
	}
	
	public Passenger getPassengerById(int passengerId) {
		return passengerRepository.findById(passengerId).get();
	}
	
	public List<Passenger> getAllPassenger(){
		return passengerRepository.findAll();
	}
	
	public Passenger updatePassenger(Passenger passenger,int passengerId) {
		return passengerRepository.save(passenger);
	}



}
