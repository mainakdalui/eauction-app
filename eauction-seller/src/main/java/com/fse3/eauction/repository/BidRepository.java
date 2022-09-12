package com.fse3.eauction.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fse3.eauction.model.Bid;

@Repository
public interface BidRepository extends CrudRepository<Bid, String> {

	List<Bid> findAllByProductId(String productId);

	List<Bid> findByProductIdOrderByBidAmountDesc(String productId);

}