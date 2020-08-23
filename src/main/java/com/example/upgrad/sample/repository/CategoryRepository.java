package com.example.upgrad.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.upgrad.sample.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findByName(String name); 
}
