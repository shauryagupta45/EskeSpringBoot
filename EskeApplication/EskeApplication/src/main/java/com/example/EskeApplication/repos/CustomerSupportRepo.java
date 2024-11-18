package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.CustomerSupport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSupportRepo extends JpaRepository<CustomerSupport, Integer> {
}
