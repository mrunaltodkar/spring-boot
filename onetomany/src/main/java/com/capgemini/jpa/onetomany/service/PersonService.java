package com.capgemini.jpa.onetomany.service;

import com.capgemini.jpa.onetomany.entity.Person;

public interface PersonService {

	public void addPerson(Person person);

	public Person getPersonById(int id);
}
