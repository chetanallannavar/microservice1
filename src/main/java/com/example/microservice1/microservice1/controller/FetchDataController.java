package com.example.microservice1.microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class FetchDataController {

	@GetMapping("/fetchdata")
	public LimitConfiguration getdata() { 
		RestTemplate template = new RestTemplate();//first comment
		LimitConfiguration forObject = template.getForObject("http://localhost:8080/limits", LimitConfiguration.class);
		return forObject;
	}

}
