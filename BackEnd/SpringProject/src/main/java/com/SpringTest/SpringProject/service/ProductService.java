package com.SpringTest.SpringProject.service;

import java.util.List;

import com.SpringTest.SpringProject.entity.Product;

public interface ProductService {

	List<Product> getAllProductList();

	Product getById(int pid);

	void deleteProduct(int pid);

	void addNewProduct(Product p);

	int updateProduct(Product p);


}
