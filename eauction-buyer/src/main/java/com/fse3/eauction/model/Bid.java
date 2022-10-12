package com.fse3.eauction.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@RedisHash("Bid")
public class Bid implements Serializable {
	
	private static final long serialVersionUID = 8302422965272937351L;

	@Id
	private String bidId;
	
	private String buyerId;
	
	@Indexed
	private String buyerEmailId;
	
	private float bidAmount;
	
	@Indexed
	private String productId;
	
}