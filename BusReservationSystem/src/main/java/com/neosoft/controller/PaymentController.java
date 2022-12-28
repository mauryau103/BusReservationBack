package com.neosoft.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Payment;
import com.neosoft.service.PaymentService;

@RestController
@RequestMapping("/Payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/addPayment")
	public Payment addPayment(@RequestBody Payment payment){
		return paymentService.addPayment(payment);
	}
	
	@GetMapping("/getPayment/{id}")
	public Payment getPayment(@PathVariable int id){
		Payment p = paymentService.getPayment(id)
;
		return p;
	}

}