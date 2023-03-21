package com.SpringTest.SpringProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringTest.SpringProject.entity.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	
	List<Car> findAll();

}
