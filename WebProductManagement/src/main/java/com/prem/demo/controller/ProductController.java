package com.prem.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.prem.demo.model.Product;
import com.prem.demo.model.ProductWrapper;
import com.prem.demo.service.ProductService;

import jakarta.websocket.server.PathParam;

@Controller

public class ProductController {
	
	@Autowired
	ProductService ps;
	
	public static int flag=0;
	
	@RequestMapping("/")
	public String intro() {
		
		return "home";
	}
	@RequestMapping("product")
	public ModelAndView formview()
	{
	
		ModelAndView mv=new ModelAndView("form");
		mv.addObject("flag",flag);
		flag=0;
		return mv;
		
	}
	@RequestMapping("add")
	public ModelAndView addProduct(ProductWrapper pw)
	{	
		
		ps.addProduct(pw);
		flag=1;
		
		return formview();
		
	}
	
	@RequestMapping("allProducts")
	public ModelAndView getAllProducts()
	{
		ModelAndView mv=new ModelAndView();
		
		List<Product> pro=ps.getAllProducts();
		mv.setViewName("view_product");
		mv.addObject("Products", pro);
		return mv;
		
		
		
	}
	
	@RequestMapping("search")
	public String searchpro()
	{	
		return "search_a_product";
	}
	
	
	@RequestMapping("pro_details")
	public ModelAndView getProductByName(@PathParam("name") String name)
	{
		
		Product pro=ps.getProductByName(name);
		ModelAndView mv=new ModelAndView("pro_details");
		
		mv.addObject("Product", pro);
		return mv;
		
	}
	
	@RequestMapping("contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("about")
	public String aboutUs() {
	 
		return "about";
	}
}
