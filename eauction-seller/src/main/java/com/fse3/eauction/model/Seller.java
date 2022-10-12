package com.fse3.eauction.model;

import java.io.Serializable;
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
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String pin;
	private String phone;
	
	@Indexed
	private String email;
	
}