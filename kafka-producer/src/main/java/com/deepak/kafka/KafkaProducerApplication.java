package com.deepak.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class KafkaProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
		System.out.println("Kafka producer started successfully");
	}
}
