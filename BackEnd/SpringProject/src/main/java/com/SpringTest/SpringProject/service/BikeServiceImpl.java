package com.SpringTest.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringTest.SpringProject.Repository.BikeRepository;
import com.SpringTest.SpringProject.entity.Bike;

@Service
public class BikeServiceImpl implements BikeService{
	
	@Autowired
	BikeRepository bikeRepository;
	
	public List<Bike> getAllBikeList(){
		List<Bike> bikes = bikeRepository.findAll();
		return bikes;
	}

	@Override
	public Bike getById(int bno) {
		Optional<Bike> op=bikeRepository.findById(bno);
		Bike b=op.get();
		return b;
	}

	@Override
	public void deleteBike(int bno) {
		bikeRepository.deleteById(bno);
		
	}

	@Override
	public void addNewBike(Bike b) {
		bikeRepository.save(b);
		
	}

	@Override
	public int updateBike(Bike b) {
		Optional<Bike> op=bikeRepository.findById(b.getBno());
		if(op.isPresent()) {
			Bike b1=op.get();
			b1.setBno(b.getBno());
			b1.setFname(b.getFname());
			b1.setFname(b.getFname());
			b1.setEmail(b.getEmail());
			b1.setAddress(b.getAddress());
			b1.setPurchasingYear(b.getPurchasingYear());
			bikeRepository.save(b1);
			return 1;
		}
		return 0;
	}
}
