package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.ProductRevenue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRevenueRepo extends JpaRepository<ProductRevenue, Integer> {
}
