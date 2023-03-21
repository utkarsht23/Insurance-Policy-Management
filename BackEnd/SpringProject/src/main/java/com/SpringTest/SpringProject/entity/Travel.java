package com.SpringTest.SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="travel")
public class Travel 
{
	@Id
	private int tid;
	
	private String destination;
	
	private String date;
	
	private int mobile;
	

}
