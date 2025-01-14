package com.example.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class Producer {

	@Autowired
	KafkaTemplate<String, String> KafkaTemplate;
	
	public void sendMsgToTopic(String message) {
		KafkaTemplate.send("topic_name_1", message);
	}
}
