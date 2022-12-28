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

import com.neosoft.model.Bus;
import com.neosoft.service.BusService;

@RestController
public class BusController {
		
	@Autowired
	private BusService busService;
	
	@PostMapping("/saveBus")
	public Bus saveBus(@RequestBody Bus bus) {
		return busService.addBus(bus);
	}
	
	@GetMapping("/getBusById/{id}")
	public Bus getBusById(@PathVariable("id")int busId) {
		return busService.getBusById(busId);
	}
	
	@GetMapping("/getAllBus")
	public List<Bus> getAllBus() {
		return busService.getAllBus();
	}
	
	@DeleteMapping("/deleteBus/{id}")
	public String deleteBus(@PathVariable("id")int busId) {
		return busService.deleteBus(busId);
	}
	
	@PutMapping("/updateBus/{id}")
	public Bus updateBus(@RequestBody Bus bus,@PathVariable("id")int busId) {
		return busService.updateBus(bus, busId);
	}
}