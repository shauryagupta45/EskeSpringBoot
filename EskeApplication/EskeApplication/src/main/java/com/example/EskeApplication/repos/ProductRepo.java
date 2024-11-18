package com.example.EskeApplication.repos;

import com.example.EskeApplication.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    // @Query(value="select m from Movies m where m.rating = :id",nativeQuery=true)
    // List<Movies> getByRating(@Param("id") int id);
}
