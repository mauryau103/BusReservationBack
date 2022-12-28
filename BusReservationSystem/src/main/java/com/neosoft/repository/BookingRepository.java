package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
