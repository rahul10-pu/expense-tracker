package com.example.upgrad.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.upgrad.sample.model.Expense;
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}