package com.info.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.ui.DTO.ProductDTO;
import com.info.ui.Service.ProductService;

@RestController
@RequestMapping("/ProductRest")
public class ProductController {
	
	@Autowired
	ProductService  service;
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Spring Rest.......Welcome to the Web Services";
	}
	
	@GetMapping("/products")
	public Iterable<ProductDTO> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@PostMapping("/addProduct")

	
	public boolean addProduct(@RequestBody ProductDTO p) {
	 service.addProduct(p);
	 return true; 
	 
	}
	
	@PutMapping("/update")
	
	 public boolean updateProduct(@RequestBody ProductDTO p) {
		 service.updateProduct(p);
		 return true;
	 }
	@DeleteMapping("/delete")
	 public boolean deleteProduct(@RequestBody int id) {
		 service.deleteProduct(id);
		 return true;
	
	}

}
