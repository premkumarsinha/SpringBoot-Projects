package com.prem.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prem.demo.dao.ProductRepository;
import com.prem.demo.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository pr;
	
	public ResponseEntity<String> addProduct(Product prod) {
		
		pr.add(prod);
		return new ResponseEntity<>("Successfully added",HttpStatus.CREATED);
		
	}

	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> li=pr.readAll();
		return new ResponseEntity<>(li,HttpStatus.OK);
	}

	public ResponseEntity<List<Product>> getProductByName(String name) {
		List<Product> p=pr.findProduct(name);
		return new ResponseEntity<>(p,HttpStatus.OK);
	}



}
