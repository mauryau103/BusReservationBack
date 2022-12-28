package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
