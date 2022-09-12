package com.fse3.eauction.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;


public class BidMessageSender {

	private static final Logger LOG = LoggerFactory.getLogger(BidMessageSender.class);
	
	@Value("${spring.kafka.topic}")
	private String topic;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		LOG.info("new bid details - {}", message);
		this.kafkaTemplate.send(topic, message);
	}

}