package com.deepak.kafka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaResource {
	
/*	@Autowired
	KafkaTemplate<String, User> kafkaTemplate;
	
	private static final String topic="Kafka_Example";
	@GetMapping("/publish")
	public String postMsg()
	{
		User obj=new User();
		kafkaTemplate.send(topic,obj);
		return "Message produced successfully";
	}*/
}
