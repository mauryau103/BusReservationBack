package com.neosoft.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Driver;
import com.neosoft.service.DriverService;

@RestController
public class DriverController {
		
	@Autowired
	private DriverService driverService;
	
	@PostMapping("/addDrivers")
	public Driver saveDriver(@RequestBody Driver driver) {
		return driverService.addDriver(driver);
	}
	
	
	@GetMapping("/GetDriversById/{id}")
	public Driver getDriverById(@PathVariable("id")int driverId) {
		return driverService.getDriverById(driverId);
	}
	
	@GetMapping("/GetDrById/{driverId}")
	public Optional<Driver> getDrById(@PathVariable int driverId){
		return this.driverService.getDrById(driverId);
	}
	
	@GetMapping("/GetAllDrivers")
	public List<Driver> getAllDrivers() {
		return driverService.getAllDrivers();
	}
	
	@DeleteMapping("/DeleteDrivers/{id}")
	public String deleteDriver(@PathVariable("id")int driverId) {
		return driverService.deleteDriver(driverId);
	}
	
	@PutMapping("/UpdateDrivers/{id}")
	public Driver updateDriver(@RequestBody Driver driver,@PathVariable("id")int driverId) {
		return driverService.updateDriver(driver, driverId);
	}
}