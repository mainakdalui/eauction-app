package com.fse3.eauction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fse3.eauction.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,String> {

	Product findByProductId(String productId);

}