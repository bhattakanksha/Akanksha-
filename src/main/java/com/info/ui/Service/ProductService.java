package com.info.ui.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.ui.DTO.ProductDTO;
import com.info.ui.Repositoy.IProductRepository;

@Service
@Transactional

public class ProductService implements IProductService {
	
	@Autowired
	IProductRepository repo; 

	@Override
	public boolean addProduct(ProductDTO p) {
		repo.save(p);
		return true;
	}

	@Override
	public boolean findProduct(int id) {
	       repo.findById(id);
		return true;
	}

	@Override
	public boolean updateProduct(ProductDTO p) {
		repo.save(p);
		return true;
	}
	 public boolean deleteProduct(int id) {
		ProductDTO p = repo.findById(id).get();
		repo.deleteById(id);
		 return true;
	 }
 
	public List<ProductDTO> getAllProducts(){
		Iterable <ProductDTO> pl=repo.findAll();
		for(ProductDTO p:pl) {
			System.out.println(p);
		}
		
		return (List<ProductDTO>) pl;
		
	}

}
