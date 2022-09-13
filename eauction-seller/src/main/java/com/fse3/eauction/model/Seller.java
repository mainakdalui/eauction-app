package com.fse3.eauction.model;

import java.io.Serializable;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
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
@RedisHash("Seller")
public class Seller implements Serializable {
	
	private static final long serialVersionUID = -1854096200709040410L;
	
	@Id
	private String sellerId;
	
	@NotNull
	@Size(min = 5, max = 30, message = "{validation.seller.fname.length}")
	private String firstName;
	
	@NotNull
	@Size(min = 3, max = 25, message = "{validation.seller.lname.length}")
	private String lastName;
	
	private String address;
	private String city;
	private String state;
	private String pin;
	
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})" , message = "{validation.seller.phone.length}")
	private String phone;
	
	@NotNull
	@Email
	@Indexed
	private String email;
	
}