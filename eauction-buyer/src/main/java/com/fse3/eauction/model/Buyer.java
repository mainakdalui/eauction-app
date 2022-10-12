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
@RedisHash("Buyer")
public class Buyer implements Serializable {
	
	private static final long serialVersionUID = -1330043775736804297L;
	
	@Id
	private String buyerId;
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String pin;
	private String phone;
	
	@Indexed
	private String email;
	
	//private float bidAmount;
}