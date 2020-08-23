package com.example.upgrad.sample.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="username")
public class UserName{
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="user_id", unique = true)
	private Long id;
	
	private String name;
	private String email;
	

}
