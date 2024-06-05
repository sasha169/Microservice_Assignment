package com.assignment.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.transaction.entity.Transaction;
import com.assignment.transaction.feignUtil.TransactionInterface;
import com.assignment.transaction.repositories.TransactionRepository;
@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	TransactionInterface transactionInterface;

	public Transaction saveTransactionDetails(Transaction transaction) {
		int fee = transactionInterface.getDetails(transaction.getId());
		transaction.setId(transaction.getId());
		transaction.setFee(fee);
		return transactionRepository.save(transaction);
	}

}
