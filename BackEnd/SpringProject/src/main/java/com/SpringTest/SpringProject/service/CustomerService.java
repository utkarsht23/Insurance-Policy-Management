package com.SpringTest.SpringProject.service;

import java.util.List;

import com.SpringTest.SpringProject.entity.Customer;

public interface CustomerService {

	List<Customer> getAllCustomerList();

	Customer getById(int cid);

	void deleteCustomer(int cid);

	void addNewCustomer(Customer c);

	int updateCustomer(Customer c);

}
