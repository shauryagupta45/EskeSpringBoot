package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
