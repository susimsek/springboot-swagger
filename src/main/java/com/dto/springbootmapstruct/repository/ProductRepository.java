package com.dto.springbootmapstruct.repository;

import com.dto.springbootmapstruct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}