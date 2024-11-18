package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
