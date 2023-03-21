package com.SpringTest.SpringProject.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
	@Id
	private int cid;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String ConfirmPassword;
	
	//@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	//@JoinColumn(name="pid")
	//private Product p; 
}
