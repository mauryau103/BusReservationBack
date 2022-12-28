package com.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}