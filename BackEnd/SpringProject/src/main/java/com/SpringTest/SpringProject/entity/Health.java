package com.SpringTest.SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="health")
public class Health 
{
	@Id
	private int hid; 
	
	private String name;
	
	private int mobile;
	
	private String gender;
	
	private int age;
	
	private String city;
	
}
