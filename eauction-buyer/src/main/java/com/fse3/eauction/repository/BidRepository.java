package com.fse3.eauction.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fse3.eauction.model.Bid;

@Repository
public interface BidRepository extends CrudRepository<Bid,String> {

	Bid findByProductIdAndBuyerEmailId(String productId, String buyerEmailId);
	
}