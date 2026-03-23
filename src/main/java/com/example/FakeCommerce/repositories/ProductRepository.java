package com.example.FakeCommerce.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.FakeCommerce.schema.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query method to find products by category
    List<Product> findByCategory(String category);

    @Query("SELECT DISTINCT category FROM Product")
    List<String> findDistinctCategories();
}
