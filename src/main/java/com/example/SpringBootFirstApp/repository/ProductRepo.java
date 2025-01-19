package com.example.SpringBootFirstApp.repository;

import com.example.SpringBootFirstApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
