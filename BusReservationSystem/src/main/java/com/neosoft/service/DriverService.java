package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Bus;
import com.neosoft.model.Driver;
import com.neosoft.repository.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository driverRepository;

	public Driver addDriver(Driver driver) {
	//	driver.getBus().forEach(item-> item.setBus(bus));
//		Bus bus=new Bus();
//		
//		//driver.getBus().setDriver(driver);
//		//System.out.println(driver.getBus().toString());
//		//driver.getBus().getBusId();
//		driver.getBus().setBusId(0);
//		driver.getBus().getBusId(driver.setBus(bus))
		//driver.getBus().setDriver(driver);
		return driverRepository.save(driver);
		
	}
	
	public String deleteDriver(int driverId) {
		driverRepository.deleteById(driverId);
		return "Driver with "+driverId+" got deleted";
	}
	
	public Driver getDriverById(int driverId) {
		return driverRepository.findById(driverId).get();
	}
	
	public Optional<Driver> getDrById(int driverId){
		return this.driverRepository.findById(driverId);
	}
	
	public List<Driver> getAllDrivers(){
		return driverRepository.findAll();
	}
	
	public Driver updateDriver(Driver driver,int driverId) {
		return driverRepository.save(driver);
	}
}