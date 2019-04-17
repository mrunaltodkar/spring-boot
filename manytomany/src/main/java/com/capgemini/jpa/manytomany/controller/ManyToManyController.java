package com.capgemini.jpa.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpa.manytomany.entity.Person;
import com.capgemini.jpa.manytomany.entity.Project;
import com.capgemini.jpa.manytomany.service.PersonService;

@RestController
public class ManyToManyController {

	@Autowired
	PersonService service;
	
	@RequestMapping("/add")
	public Set<Person> addPerson() {
		Set<Project> projects = new HashSet<Project>();
		Set<Project> project1 = new HashSet<Project>();
		projects.add(new Project(402, "HANA"));
		projects.add(new Project(403, "ABAP"));
		projects.add(new Project(401, "Cloud"));
		
		project1.add(new Project(401, "Cloud"));
		
		Set<Person> persons = new HashSet<Person>(); 
		
		persons.add(new Person(104, "Mrunal", projects));
		persons.add(new Person(105, "Aayush", project1));
		
		service.addPerson(persons);
		return persons;
	}
}
