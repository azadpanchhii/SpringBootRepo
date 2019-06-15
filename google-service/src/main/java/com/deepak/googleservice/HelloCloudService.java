package com.deepak.googleservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCloudService {
	
	@RequestMapping("firstApp")
	public String hello()
	{
		return "My first app in Google cloud service";
	}
}
