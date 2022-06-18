package com.Nishkar.springbootbackend.G4L_Reverside.repository;

import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}