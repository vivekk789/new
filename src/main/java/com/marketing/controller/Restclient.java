package com.marketing.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.marketing.dto.Lead;

@Component
public class Restclient {
	public Lead getRecord(long id) {
		RestTemplate restTemplate = new RestTemplate();
		Lead lead = restTemplate.getForObject("http://localhost:8080/zohocrmapp/search/"+ id , Lead.class);
		return lead;
	}

}
