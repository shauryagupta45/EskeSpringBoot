package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepo extends JpaRepository<Delivery, Integer> {
}
