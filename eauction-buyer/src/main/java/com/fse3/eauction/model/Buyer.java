package com.fse3.eauction.model;

import java.io.Serializable;

import javax.validation.constraints.Email;
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
@RedisHash("Buyer")
public class Buyer implements Serializable {
	
	private static final long serialVersionUID = -1330043775736804297L;
	
	@Id
	private String buyerId;
	
	@NotNull
	@Size(min = 5, max = 30, message = "{validation.buyer.fname.length}")
	private String firstName;
	
	@NotNull
	@Size(min = 3, max = 25, message = "{validation.buyer.lname.length}")
	private String lastName;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private String pin;
	
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})" , message = "{validation.buyer.phone.length}")
	private String phone;
	
	@NotNull
	@Email
	@Indexed
	private String email;
	
	//private float bidAmount;
	
}