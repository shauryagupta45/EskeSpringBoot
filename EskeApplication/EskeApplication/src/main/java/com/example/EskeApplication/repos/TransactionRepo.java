package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
}
