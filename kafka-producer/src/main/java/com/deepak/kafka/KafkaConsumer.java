package com.deepak.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="Kafka_Example", groupId="group_id" , containerFactory="kafkaListenerContainerFactory")
	public void consume(String message)
	{
		System.out.println("Message is :: "+message);
	}
	
	@KafkaListener(topics="Kafka_Example_Json", groupId="group_json", containerFactory="userListenerContainerFactory")
	public void consumeUser(User user)
	{
		System.out.println("User  is :: "+user);
	}
}
