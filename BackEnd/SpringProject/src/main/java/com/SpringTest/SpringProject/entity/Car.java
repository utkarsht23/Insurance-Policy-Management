package com.SpringTest.SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Car")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int model;
	
	private String fname;
	
	private String lname;

	private String mobile;
	
	private String Address;

	private String email;
	
	private String purchasingYear ;	
	
	
	}
