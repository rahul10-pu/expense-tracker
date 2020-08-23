package com.example.upgrad.sample.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.upgrad.sample.model.Category;
import com.example.upgrad.sample.repository.CategoryRepository;

@RestController
@RequestMapping("/api")
public class CategoryController {
	private CategoryRepository categoryRepository;

	public CategoryController(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}
	@GetMapping("/categories")
	Collection<Category> categories(){
		return categoryRepository.findAll();
	}
}
