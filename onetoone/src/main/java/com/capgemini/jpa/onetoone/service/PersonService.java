package com.capgemini.jpa.onetoone.service;

import com.capgemini.jpa.onetoone.entity.Person;

public interface PersonService {

	public void addPerson(Person person);

	public Person getPersonById(int id);
}
