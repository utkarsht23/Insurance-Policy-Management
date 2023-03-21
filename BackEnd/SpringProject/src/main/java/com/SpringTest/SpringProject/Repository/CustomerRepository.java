package com.SpringTest.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringTest.SpringProject.entity.Bike;
import com.SpringTest.SpringProject.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
