package com.fse3.eauction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fse3.eauction.model.Buyer;

@Repository
public interface BuyerRepository extends CrudRepository<Buyer,String> {

	Buyer findByEmail(String email);
	
}