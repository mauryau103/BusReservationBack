package com.neosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Booking;
import com.neosoft.repository.BookingRepository;

@Service
public class BookingService {


	@Autowired
	private BookingRepository bookingRepository;
	
	public Booking addBooking(Booking booking) {
		return bookingRepository.save(booking);
	}
	
	public String deleteBooking(int bookingId) {
		bookingRepository.deleteById(bookingId);
		return "Booking with "+bookingId+" got deleted";
	}
	
	public Booking getBookingById(int bookingId) {
		return bookingRepository.findById(bookingId).get();
	}
	
	public List<Booking> getAllBookings(){
		return bookingRepository.findAll();
	}
	
	public Booking updateBooking(Booking booking,int bookingId) {
		return bookingRepository.save(booking);
	}

}
