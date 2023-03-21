package com.SpringTest.SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="home")
public class Home
{
	@Id
	private int hid;
	
	private String name;

	private int mobile;
	
	private String city;
	
	private String Property_Type;
	
	private int coverage;
}
