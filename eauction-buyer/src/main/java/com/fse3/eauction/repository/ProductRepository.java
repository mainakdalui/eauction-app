package com.fse3.eauction.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fse3.eauction.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,String> {

	Optional<Product> findById(String productId);

}