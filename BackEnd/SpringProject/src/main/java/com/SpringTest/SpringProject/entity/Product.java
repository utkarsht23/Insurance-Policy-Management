package com.SpringTest.SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.Mapping;

import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

	@Id
	private int pid;
	
	private String pname;
	
	
	
	
}
