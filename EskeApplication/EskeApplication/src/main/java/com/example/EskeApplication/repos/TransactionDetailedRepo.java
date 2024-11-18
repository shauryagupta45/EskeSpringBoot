package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.TransactionDetailed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDetailedRepo extends JpaRepository<TransactionDetailed, Integer> {
}
