package com.example.ecommerce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Person;
import com.example.ecommerce.service.EcommerceService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Controller {

		@Autowired
		EcommerceService pService;
		@Tag(name="Get",description="get data")
		@GetMapping("/getAllPersons")
		public List<Person> fetchAllPersons() {
			List<Person> pList=pService.fetchAllPersons();
			return pList;
		}
		
		@PostMapping("/savePersons") 
		public Person savePersons(@RequestBody Person p) {
			return pService.savePersons(p);
		}
	}


