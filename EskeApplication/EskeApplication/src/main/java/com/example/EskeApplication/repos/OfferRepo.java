package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepo extends JpaRepository<Offer, Integer> {
}
