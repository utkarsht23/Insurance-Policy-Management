package com.SpringTest.SpringProject.service;

import java.util.List;

import com.SpringTest.SpringProject.entity.Health;

public interface HealthService {

	List<Health> getAllHealthList();

	Health getById(int hid);

	void addNewHealth(Health h);

	void deleteHealth(int hid);

	int updateHealth(Health h);

	

}
