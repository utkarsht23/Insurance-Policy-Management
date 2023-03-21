package com.SpringTest.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringTest.SpringProject.entity.Health;
import com.SpringTest.SpringProject.entity.Product;
@Repository
public interface HealthRepository  extends JpaRepository<Health, Integer>{

}
