
package com.SpringTest.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringTest.SpringProject.Repository.CustomerRepository;
import com.SpringTest.SpringProject.entity.Bike;
import com.SpringTest.SpringProject.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	public CustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> getAllCustomerList() {
		
			List<Customer> customers =customerRepository.findAll();
			return customers;		
	}
	@Override
	public Customer getById(int cid) {
		
		Optional<Customer> op=customerRepository.findById(cid);
		Customer c=op.get();
		return c;
	}
	@Override
	public void deleteCustomer(int cid) {
		customerRepository.deleteById(cid);
	}
	@Override
	public void addNewCustomer(Customer c) {
		customerRepository.save(c);
	}
	@Override
	public int updateCustomer(Customer c) {
		Optional<Customer> op=customerRepository.findById(c.getCid());
		if(op.isPresent())
		{
			Customer c1=op.get();
			c1.setFirstName(c.getFirstName());
			c1.setLastName(c.getLastName());
			c1.setEmail(c.getEmail());
			c1.setConfirmPassword(c.getConfirmPassword());
			customerRepository.save(c1);
		}
			
		return 0;
	}

}
