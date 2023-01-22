package com.kku.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kku.second.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

}
