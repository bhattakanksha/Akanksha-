package com.info.ui.Service;

import java.util.List;

import com.info.ui.DTO.ProductDTO;

public interface IProductService {
	
	public boolean addProduct(ProductDTO  p);
	
	 public boolean findProduct(int id);
	 public boolean updateProduct(ProductDTO p);
	 public List<ProductDTO> getAllProducts();
	 
			
}
	 
	