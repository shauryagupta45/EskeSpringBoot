package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepo extends JpaRepository<Campaign, Integer> {
}
