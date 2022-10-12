package com.fse3.eauction.model;

import java.io.Serializable;
import java.util.Date;
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
@RedisHash("Product")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 5309039801210144755L;
	
	@Id
	private String productId;
	
	private String productName;
	private String shortDescription;
	private String detailDescription;
	private String category;
	private float startingPrice;
	private Date bidEndDate;
	private String sellerEmailId;
	
}