package com.capgemini.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.rest.entity.Person;
import com.capgemini.rest.service.PersonService;

@RestController
public class DemoController {

	@Autowired
	private PersonService service;

	@PostMapping(path = "/addNew")
	public Person addPerson() {
		Person person = new Person(101, "Mrunal");
		service.addPerson(person);
		return person;
	}

	@GetMapping
	public List<Person> getPerson() {
		return service.getPerson();
	}

	@GetMapping("/byId/{personId}")
	public Person findById(@PathVariable int personId) {
		Person person = new Person(101, "Mrunal");
		service.findById(101);
		return person;
	}
}
