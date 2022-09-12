package com.fse3.eauction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fse3.eauction.model.Seller;

@Repository
public interface SellerRepository extends CrudRepository<Seller,String> {
	
	Seller findByEmail(String email);
	
}