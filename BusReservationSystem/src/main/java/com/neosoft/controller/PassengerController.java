package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Passenger;
import com.neosoft.service.PassengerService;

@RestController
public class PassengerController {

	
	@Autowired
	private PassengerService passengerService;
	
	

	@PostMapping("/savePassenger")
	public Passenger savePassenger(@RequestBody Passenger passenger) {
		return passengerService.addPassenger(passenger);
	}
	
	@GetMapping("/getPassengerById/{id}")
	public Passenger getPassengerById(@PathVariable("id")int passengerId) {
		return passengerService.getPassengerById(passengerId);
	}
	
	@GetMapping("/getAllPassenger")
	public List<Passenger> getAllPassenger() {
		return passengerService.getAllPassenger();
	}
	
	@DeleteMapping("/deletePassenger/{id}")
	public String deletePassenger(@PathVariable("id")int passengerId) {
		return passengerService.deletePassenger(passengerId);
	}
	
	@PutMapping("/updatePassenger/{id}")
	public Passenger updatePassenger(@RequestBody Passenger passenger,@PathVariable("id")int passengerId) {
		return passengerService.updatePassenger(passenger, passengerId);
	}
	
}
