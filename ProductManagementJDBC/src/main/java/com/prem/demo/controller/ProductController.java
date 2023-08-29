package com.prem.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prem.demo.model.Product;
import com.prem.demo.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping("add")
	public ResponseEntity<String> addProduct(@RequestBody Product prod)
	{
		return ps.addProduct(prod);
	}
	
	@GetMapping("allProducts")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		return ps.getAllProducts();
	}

	@GetMapping("findproduct/{name}")
	public ResponseEntity<List<Product>> getProductByName(@PathVariable String name)
	{
		
		return ps.getProductByName(name);
	}
}
