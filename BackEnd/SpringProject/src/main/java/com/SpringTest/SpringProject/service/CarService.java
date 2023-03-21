package com.SpringTest.SpringProject.service;

import java.util.List;

import com.SpringTest.SpringProject.entity.Bike;
import com.SpringTest.SpringProject.entity.Car;

public interface CarService {

	public List<Car> getAllCarList();

	public Car getByCarId(int cno);

	public void deleteCar(int cno);

	public void addNewCar(Car c);

	
			

}
