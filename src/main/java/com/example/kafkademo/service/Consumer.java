package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	
	@KafkaListener(topics="topic_name_1", groupId="topic_name_group")
	public void listenToTopicMessage(String message) {
		System.out.println("Message" + message);
	}

}
