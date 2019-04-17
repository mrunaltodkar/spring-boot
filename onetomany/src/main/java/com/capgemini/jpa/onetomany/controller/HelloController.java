package com.capgemini.jpa.onetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpa.onetomany.entity.Certificate;
import com.capgemini.jpa.onetomany.entity.Person;
import com.capgemini.jpa.onetomany.service.PersonService;

@RestController
public class HelloController {

	@Autowired
	PersonService service;

	@RequestMapping("/certificate")
	public Person certificatePerson() {

		Set<Certificate> certificates = new HashSet<Certificate>();
		Certificate certificate1 = new Certificate(301, "Java");
		Certificate certificate2 = new Certificate(302, "python");
		certificates.add(certificate1);
		certificates.add(certificate2);

		Person person = new Person(102, "abc", certificates);
		service.addPerson(person);
		return person;
	}

	@RequestMapping("/show")
	public Person getPerson() {
		return service.getPersonById(102);
	}

}
