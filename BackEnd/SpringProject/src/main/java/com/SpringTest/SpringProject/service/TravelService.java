package com.SpringTest.SpringProject.service;

import java.util.List;

import com.SpringTest.SpringProject.entity.Travel;

public interface TravelService {

	List<Travel> getAlltravelList();

	Travel getById(int tid);

	void addNewTravel(Travel t);

	void deleteTravel(int tid);

	int updateTravel(Travel t);

	

}
