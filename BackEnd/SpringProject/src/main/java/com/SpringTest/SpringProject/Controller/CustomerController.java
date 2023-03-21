package com.SpringTest.SpringProject.Controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringTest.SpringProject.entity.Bike;
import com.SpringTest.SpringProject.entity.Customer;
import com.SpringTest.SpringProject.entity.Product;
import com.SpringTest.SpringProject.service.CustomerService;

import lombok.Data;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="*")
public class CustomerController {
	
	@Autowired
	public CustomerService customerService;
	

	@GetMapping(value = "customerlist")
	public List<Customer> getAllCustomer(){
		
		List<Customer> customers = customerService.getAllCustomerList();
		return customers;
		
	}
	
	@GetMapping(value = "customer/{cid}")
	public Customer getById(@PathVariable int cid)
	{
		Customer c=customerService.getById(cid);
		if(c!=null)
		{
			return c;
		}
		else {
			System.out.println("not found");
			return null;
		}
	}
	@DeleteMapping(value="customer/{cid}")
	public void deleteCustomer(@PathVariable int cid)
	{
		customerService.deleteCustomer(cid);
	}
	
	@PostMapping(value="customer/{cid}")
	public void  addCustomer(@RequestBody Customer c)
	{
		customerService.addNewCustomer(c);
	}
	
	
	@PutMapping(value="customer/{cid}")
	public int updateCustomer(@RequestBody Customer c)
	{
		int n=customerService.updateCustomer(c);
	
		if(n>0)
		{
			System.out.println("updated Successfully"); 
			return 1;
		}
		else {
			System.out.println("not updated");
		}
		return 0;
		
	}

}
