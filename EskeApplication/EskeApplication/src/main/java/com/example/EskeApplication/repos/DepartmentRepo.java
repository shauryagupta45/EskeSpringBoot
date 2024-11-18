package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
