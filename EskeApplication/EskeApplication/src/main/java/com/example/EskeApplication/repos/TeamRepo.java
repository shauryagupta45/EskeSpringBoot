package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team, Integer> {
}
