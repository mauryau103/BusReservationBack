package com.neosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Payment;
import com.neosoft.repository.PaymentRepository;


@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment addPayment(Payment p) {
		return paymentRepository.save(p);
		
	}
	
	public Payment getPayment(int paymentId) {
		Payment p =paymentRepository.findById(paymentId).orElseThrow(() -> new RuntimeException("Does not exist"));
		return p;
	}
	

}