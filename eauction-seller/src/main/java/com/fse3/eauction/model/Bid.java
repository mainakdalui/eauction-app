package com.fse3.eauction.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
public class Bid implements Serializable {

	private static final long serialVersionUID = 4465590632589185461L;

	@Id
	private String bidId;
	
	@Size(min = 1)
	private String sellerId;
	
	@Size(min = 1)
	private String buyerId;
	
	@NotNull
	private String productId;
	
	@Size(min = 1)
	private float bidAmount;
	
	@Size(min = 1)
	private boolean active;
	
}