package com.SpringTest.SpringProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringTest.SpringProject.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {
	
	List<Bike> findAll();
	
}
