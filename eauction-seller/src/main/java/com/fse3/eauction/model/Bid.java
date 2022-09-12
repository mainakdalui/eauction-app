package com.fse3.eauction.model;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@RedisHash("Bid")
public class Bid {
	
	@Id
	private String bidId;
	
	@NotNull
	private String sellerId;
	
	@NotNull
	private String buyerId;
	
	@NotNull
	private String productId;
	
	@NotNull
	private float bidAmount;
	
	@NotNull
	private boolean active;
	
}