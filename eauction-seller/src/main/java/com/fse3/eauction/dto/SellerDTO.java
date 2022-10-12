package com.fse3.eauction.dto;

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
public class SellerDTO {
	
	@Size(min = 5, max = 30, message = "{validation.seller.fname.length}")
	private String firstName;
	
	@Size(min = 3, max = 25, message = "{validation.seller.lname.length}")
	private String lastName;
	
	private String address;
	private String city;
	private String state;
	private String pin;
	
	@Size(min = 1)
	@Pattern(regexp="(^$|[0-9]{10})" , message = "{validation.seller.phone.length}")
	private String phone;
	
	@Size(min = 1)
	@Email
	private String email;
	
}