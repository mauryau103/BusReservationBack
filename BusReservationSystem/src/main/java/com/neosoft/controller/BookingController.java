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

import com.neosoft.model.Booking;
import com.neosoft.service.BookingService;
@RestController
public class BookingController {


	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/saveBooking")
	public Booking saveBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
	
	@GetMapping("/getBookingById/{id}")
	public Booking getBookingById(@PathVariable("id")int bookingId) {
		return bookingService.getBookingById(bookingId);
	}
	
	@GetMapping("/getAllBooking")
	public List<Booking> getAllBookings() {
		return bookingService.getAllBookings();
	}
	
	@DeleteMapping("/deleteBooking/{id}")
	public String deleteBooking(@PathVariable("id")int bookingId) {
		return bookingService.deleteBooking(bookingId);
	}
	
	@PutMapping("/updateBooking/{id}")
	public Booking updateBooking(@RequestBody Booking booking,@PathVariable("id")int bookingId) {
		return bookingService.updateBooking(booking, bookingId);
	}
}
