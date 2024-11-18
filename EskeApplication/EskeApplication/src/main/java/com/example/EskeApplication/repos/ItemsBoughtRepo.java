package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.ItemsBought;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsBoughtRepo extends JpaRepository<ItemsBought, Integer> {
}
