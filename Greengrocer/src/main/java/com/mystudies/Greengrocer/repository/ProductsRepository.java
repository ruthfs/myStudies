package com.mystudies.Greengrocer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystudies.Greengrocer.model.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
