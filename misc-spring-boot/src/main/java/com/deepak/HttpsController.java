package com.deepak;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {
	
	@Value("${spring.msg}")
	private String msg;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello Deepak from Https" + msg;
	}
}
