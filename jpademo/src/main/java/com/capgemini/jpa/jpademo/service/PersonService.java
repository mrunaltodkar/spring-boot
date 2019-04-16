package com.capgemini.jpa.jpademo.service;

import com.capgemini.jpa.jpademo.entity.Person;

public interface PersonService {

	public void addPerson(Person person);

	public Person getPersonById(int id);
}
