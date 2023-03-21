package com.SpringTest.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringTest.SpringProject.Repository.ProductRepository;
import com.SpringTest.SpringProject.Repository.TravelRepository;
import com.SpringTest.SpringProject.entity.Product;
import com.SpringTest.SpringProject.entity.Travel;
@Service
public class TravelServiceImpl implements TravelService
{

	@Autowired
	 private TravelRepository travelRepository;
	@Override
	public List<Travel> getAlltravelList() {
		
		return travelRepository.findAll();
	}
	
	
	@Override
	public Travel getById(int tid) {
		Optional<Travel> op=travelRepository.findById(tid);
		Travel t=op.get();
		return t;
	}

	@Override
	public void deleteTravel(int tid) {
		travelRepository.deleteById(tid);
		
	}

	@Override
	public void addNewTravel(Travel t) {
		travelRepository.save(t);
		
	}

	@Override
	public int updateTravel(Travel t) {
		Optional<Travel> op=travelRepository.findById(t.getTid());
		if(op.isPresent()) {
		Travel t1=op.get();
		t1.setDate(t.getDate());
		t1.setDestination(t.getDestination());
		t1.setMobile(t.getMobile());
		travelRepository.save(t1);
		return 1;
		}
		return 0;
	}
}
