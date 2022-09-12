package com.fse3.eauction.model;

import java.io.Serializable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
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
	@Size(min = 5, message = "{validation.seller.fname.short}")
	@Size(max = 30, message = "{validation.seller.lname.long}")
	private String firstName;
	
	@NotNull
	@Size(min = 5, message = "{validation.name.short}")
	@Size(max = 25, message = "{validation.name.long}")
	private String lastName;
	
	private String address;
	private String city;
	private String state;
	private String pin;
	
	@NotNull
	@Size(min = 10, max = 10, message = "{validation.phone.length")
	private String phone;
	
	@NotNull
	@Email
	@Indexed
	private String email;
	
}