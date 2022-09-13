package com.fse3.eauction.model;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
@RedisHash("Product")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 5309039801210144755L;
	
	@Id
	private String productId;
	
	@NotNull
	@Size(min = 5, max = 30, message = "{validation.product.name.length}")
	private String productName;
	
	private String shortDescription;
	private String detailDescription;
	private String category;
	
	@Pattern(regexp="(/[+-]?[0-9]+\\.?[0-9]*/)" , message = "{validation.product.price.format}")
	private float startingPrice;
	
	private Date bidEndDate;
	private String sellerEmailId;
	
}