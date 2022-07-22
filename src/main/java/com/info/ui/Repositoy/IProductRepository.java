package com.info.ui.Repositoy;

import org.springframework.data.repository.CrudRepository;

import com.info.ui.DTO.ProductDTO;

public interface IProductRepository extends CrudRepository<ProductDTO , Integer> {

}
