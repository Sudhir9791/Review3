package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Person;
import com.example.ecommerce.repository.PersonRepository;



@Service
public class EcommerceService {
	@Autowired
	PersonRepository personRepo;
	
	public List<Person> fetchAllPersons(){
		return personRepo.findAll();
	}
	
	public Person savePersons(Person p) {
		return personRepo.save(p);
	}
	
}

