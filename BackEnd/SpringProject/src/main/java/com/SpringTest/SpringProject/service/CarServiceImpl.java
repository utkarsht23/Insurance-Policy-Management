package com.SpringTest.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringTest.SpringProject.Repository.BikeRepository;
import com.SpringTest.SpringProject.Repository.CarRepository;
import com.SpringTest.SpringProject.entity.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepository ;
	
	public List<Car> getAllCarList(){
		
		List<Car> cars = carRepository.findAll();
		
		return cars;
}

	@Override
	public Car getByCarId(int cno) {
		Optional<Car> op=carRepository.findById(cno);
		Car c=op.get();
		return c;
	}

	@Override
	public void deleteCar(int cno) {
		carRepository.deleteById(cno);
		
	}

	@Override
	public void addNewCar(Car c) {
		carRepository.save(c);
		
	}
}
