package com.example.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkademo.service.Producer;



@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMessage {
	
	
	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam String message) {
		producer.sendMsgToTopic(message);
	}

}

