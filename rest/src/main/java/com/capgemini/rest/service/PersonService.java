package com.capgemini.rest.service;

import java.util.List;

import com.capgemini.rest.entity.Person;

public interface PersonService {

	public Person addPerson(Person person);
	
	public List<Person> getPerson();
	
	public Person findById(int personId);
 
}
