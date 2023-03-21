package com.SpringTest.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringTest.SpringProject.Repository.HealthRepository;
import com.SpringTest.SpringProject.entity.Customer;
import com.SpringTest.SpringProject.entity.Health;

@Service
public class HealthServiceImpl implements HealthService
{
	@Autowired
	HealthRepository healthRepository;
	
	@Override
	public List<Health> getAllHealthList() {
		
		return healthRepository.findAll();
	}

	@Override
	public Health getById(int hid) {
		Optional<Health> op=healthRepository.findById(hid);
		Health h=op.get();
		return h;
	}

	@Override
	public void addNewHealth(Health h) {
		healthRepository.save(h);	
	}

	@Override
	public void deleteHealth(int hid) {
		healthRepository.deleteById(hid);
	}

	@Override
	public int updateHealth(Health h) {
		Optional<Health> op=healthRepository.findById(h.getHid());
		if(op.isPresent())
		{
				Health h1=op.get();
			h1.setName(h.getName());
			h1.setMobile(h.getMobile());
			h1.setAge(h.getAge());
			h1.setGender(h.getGender());
			h1.setCity(h.getCity());
			healthRepository.save(h1);
		}
			
		return 0;
	}
	
	

	
}
