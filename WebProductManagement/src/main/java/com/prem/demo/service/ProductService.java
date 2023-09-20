package com.prem.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.prem.demo.dao.ProductRepository;
import com.prem.demo.model.Product;
import com.prem.demo.model.ProductWrapper;

@Service
public class ProductService {

	@Autowired
	ProductRepository pr;
	
	public void addProduct(ProductWrapper prod) {
		
		Product pro=new Product();
		pro.setName(prod.getName());
		pro.setType(prod.getType());
		pro.setPlace(prod.getPlace());
		pro.setWarranty(prod.getWarranty());
		pr.save(pro);
		
		
	}

	public List<Product> getAllProducts() {
			
		List<Product> prod=pr.findAll();
		return prod;
	}

	public Product getProductByName(String name) {
		
		Product p=pr.findByName(name);
		return p;
	}

}
