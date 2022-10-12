package com.fse3.eauction.dto;

import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BidDTO {
	
	@Size(min = 1)
	private String buyerId;
	
	@Size(min = 1)
	private String buyerEmailId;
	
	private float bidAmount;
	
	@Size(min = 1)
	private String productId;
	
}