package com.fse3.eauction.dto;

import java.util.Date;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProductDTO {
	
	@Size(min = 5, max = 30, message = "{validation.product.name.length}")
	private String productName;
	
	private String shortDescription;
	private String detailDescription;
	private String category;
	
	//@Pattern(regexp="(/[+-]?[0-9]+\\.?[0-9]*/)" , message = "{validation.product.price.format}")
	private float startingPrice;
	
	private Date bidEndDate;
	
	@Size(min = 1)
	@Email
	private String sellerEmailId;
	
}