package com.capgemini.jpa.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpa.onetoone.entity.Person;
import com.capgemini.jpa.onetoone.entity.Profile;
import com.capgemini.jpa.onetoone.service.PersonService;

@RestController
public class OneToOneController {

	@Autowired
	PersonService service;

	@RequestMapping("/person")
	public Person addPerson() {
		Person person = new Person(101, "Mrunal", new Profile(201,"Analyst"));
		service.addPerson(person);
		return person;
	}

	@RequestMapping("/show")
	public Person getPerson() {
		return service.getPersonById(101);
	}

}
