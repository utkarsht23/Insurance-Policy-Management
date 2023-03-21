package com.SpringTest.SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "bike")
public class Bike {

	@Id
	private int bno;

	private String fname;
	
	private String lname;
	
	private String mobile;
	
	private String Address;

	private String email;
	
	private String purchasingYear ;	
	
	
	
//	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	private Customer c;
//	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//	private Product p;
	
}
