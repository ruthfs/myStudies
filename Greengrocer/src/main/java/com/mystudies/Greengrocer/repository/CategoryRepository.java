package com.mystudies.Greengrocer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mystudies.Greengrocer.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
