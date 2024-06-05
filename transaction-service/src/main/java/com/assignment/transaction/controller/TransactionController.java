package com.assignment.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.transaction.entity.Transaction;

import com.assignment.transaction.service.TransactionService;

@RestController
@RequestMapping("transaction")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@PostMapping("/save")
	public ResponseEntity<String> createTransactionDetails(@RequestBody Transaction transactionDetails) {
		transactionService.saveTransactionDetails(transactionDetails);
		ResponseEntity<String> response = new ResponseEntity<>("Success", HttpStatus.CREATED);
		return response;
	}

}
