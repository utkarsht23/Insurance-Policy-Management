package com.SpringTest.SpringProject.service;

import java.util.List;

import com.SpringTest.SpringProject.entity.Home;

public interface HomeService {

	List<Home> getAllhomeList();

	Home getById(int hid);

	void addNewHome(Home h);

	void deleteHome(int hid);

	int updateHome(Home h);

}
