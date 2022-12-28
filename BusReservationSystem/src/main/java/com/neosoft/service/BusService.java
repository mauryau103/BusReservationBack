package com.neosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Bus;
import com.neosoft.repository.BusRepository;

@Service
public class BusService {

	@Autowired
	private BusRepository busRepository;
	
	public Bus addBus(Bus bus) {
//		bus.getPassenger().forEach(item-> item.setBus(bus));
		return busRepository.save(bus);
	}
	
	public String deleteBus(int busId) {
		busRepository.deleteById(busId);
		return "Bus with "+busId+" got deleted";
	}
	
	public Bus getBusById(int busId) {
		return busRepository.findById(busId).get();
	}
	
	public List<Bus> getAllBus(){
		return busRepository.findAll();
	}
	
	public Bus updateBus(Bus bus,int busId) {
		return busRepository.save(bus)
;
	}
}