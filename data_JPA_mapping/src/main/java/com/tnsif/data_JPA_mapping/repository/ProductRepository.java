package com.tnsif.data_JPA_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.data_JPA_mapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
