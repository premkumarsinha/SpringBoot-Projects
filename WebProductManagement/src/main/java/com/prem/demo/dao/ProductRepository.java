package com.prem.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prem.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	Product findByName(String name);

}
