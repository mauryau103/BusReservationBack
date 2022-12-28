package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

}