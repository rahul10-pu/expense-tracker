package com.example.upgrad.sample.model;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name="expense")
public class Expense {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private Instant expensedate;
	
	private String description;
	
	private String location;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
	private UserName userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getExpensedate() {
		return expensedate;
	}

	public void setExpensedate(Instant expensedate) {
		this.expensedate = expensedate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public UserName getUser() {
		return userName;
	}

	public void setUser(UserName user) {
		this.userName = user;
	}

	
}
