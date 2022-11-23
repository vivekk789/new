package com.marketing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.dto.Lead;


@Controller
public class RestController {
	
	@Autowired
	private Restclient rest;
	
		@RequestMapping("/search")
		public String searchId() {
			return "search";
		}
		
		@RequestMapping("/get")
		public String getId(@RequestParam("id")long id , Model model) {
			
			Lead lead = rest.getRecord(id);
			model.addAttribute("lead",lead);
			return "show";
		}
		
		
		
		
}
