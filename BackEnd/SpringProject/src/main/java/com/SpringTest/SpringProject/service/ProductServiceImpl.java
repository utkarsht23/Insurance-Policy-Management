package com.SpringTest.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringTest.SpringProject.Repository.ProductRepository;
import com.SpringTest.SpringProject.entity.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProductList() {
		
		List<Product> products= productRepository.findAll();
			return products;
	}
	
	@Override
	public Product getById(int pid) {
		Optional<Product> op=productRepository.findById(pid);
		Product p=op.get();
		return p;
	}

	@Override
	public void deleteProduct(int pid) {
		productRepository.deleteById(pid);
		
	}

	@Override
	public void addNewProduct(Product p) {
		productRepository.save(p);
		
	}

	@Override
	public int updateProduct(Product p) {
		Optional<Product> op=productRepository.findById(p.getPid());
		if(op.isPresent()) {
		Product p1=op.get();
		p1.setPname(p.getPname());
		return 1;
		}
		return 0;
	}

}
