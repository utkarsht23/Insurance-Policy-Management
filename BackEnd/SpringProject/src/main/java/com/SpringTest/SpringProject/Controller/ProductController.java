package com.SpringTest.SpringProject.Controller;

import java.util.List;

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
import com.SpringTest.SpringProject.entity.Car;
import com.SpringTest.SpringProject.entity.Customer;
import com.SpringTest.SpringProject.entity.Product;

import com.SpringTest.SpringProject.service.ProductService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="*")
public class ProductController {

	@Autowired
	public ProductService productService;
	

	@GetMapping(value = "productlist")
	public List<Product> getAllProduct(){
		
		List<Product> products = productService.getAllProductList();
		return products;
		
	}
	
	@GetMapping(value = "product/{pid}")
	public Product getById(@PathVariable int pid)
	{
		Product p=productService.getById(pid);
		if(p!=null)
		{
			System.out.println(p);
			return p;
		}
		else {
			System.out.println("not found");
			return null;
		}
		
	}
	@DeleteMapping(value="product/{pid}")
	public void deleteProduct(@PathVariable int pid)
	{
		productService.deleteProduct(pid);
	}
	
	@PostMapping(value="product/{pid}")
	public void  addProduct(@RequestBody Product p)
	{
		productService.addNewProduct(p);
	}
	
	
	@PutMapping(value="product/{pid}")
	public int updateProduct(@RequestBody Product p)
	{
		int n=productService.updateProduct(p);
	
		if(n>0)
		{
			System.out.println("updated Successfully"); 
			
		}
		else {
			System.out.println("not updated");
		}
		return 0;
		
	}


}
