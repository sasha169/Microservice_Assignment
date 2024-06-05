package com.assignment.transaction.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.transaction.entity.Transaction;

@Repository
	public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

	}

