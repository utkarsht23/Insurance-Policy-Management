package com.SpringTest.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringTest.SpringProject.entity.Home;
import com.SpringTest.SpringProject.entity.Product;
@Repository
public interface HomeRepository extends JpaRepository<Home, Integer>{

}
