package com.SpringTest.SpringProject.service;

import java.util.List;

import com.SpringTest.SpringProject.entity.Bike;

public interface BikeService {

	public List<Bike> getAllBikeList();

	public Bike getById(int bno);

	public void deleteBike(int bno);

	public void addNewBike(Bike b);

	public int updateBike(Bike b);
	
		
	

}
