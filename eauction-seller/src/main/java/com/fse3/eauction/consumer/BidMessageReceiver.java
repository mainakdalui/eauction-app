package com.fse3.eauction.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BidMessageReceiver {

	@KafkaListener(topics = "${spring.kafka.topic}" , groupId = "groupId")
	public void receive(String message) {
		log.info("new bid received: {}", message);
	}
}