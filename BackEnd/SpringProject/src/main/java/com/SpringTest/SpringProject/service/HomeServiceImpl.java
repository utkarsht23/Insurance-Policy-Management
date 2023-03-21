package com.SpringTest.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringTest.SpringProject.Repository.HomeRepository;
import com.SpringTest.SpringProject.entity.Home;
import com.SpringTest.SpringProject.entity.Product;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeRepository homeRepository;
	
	
	@Override
	public List<Home> getAllhomeList() {
		
		return homeRepository.findAll();
	}

	@Override
	public Home getById(int hid) {
		Optional<Home> op=homeRepository.findById(hid);
		Home h=op.get();
		return h;
	}

	@Override
	public void deleteHome(int hid) {
		homeRepository.deleteById(hid);
		
	}

	@Override
	public void addNewHome(Home h) {
		homeRepository.save(h);
		
	}

	@Override
	public int updateHome(Home h) {
		Optional<Home> op=homeRepository.findById(h.getHid());
		if(op.isPresent()) {
		Home h1=op.get();
		h1.setName(h.getName());
		h1.setMobile(h.getMobile());
		h1.setProperty_Type(h.getProperty_Type());
		h1.setCity(h.getCity());
		homeRepository.save(h1);
		return 1;
		}
		return 0;
	}



	
}
