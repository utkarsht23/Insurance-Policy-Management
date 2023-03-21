package com.SpringTest.SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="login")
public class Login
{
	@Id
	private String email;
	
	private String password;
	
	
}
