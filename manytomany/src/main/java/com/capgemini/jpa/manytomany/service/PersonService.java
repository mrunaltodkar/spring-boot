package com.capgemini.jpa.manytomany.service;

import java.util.Set;

import com.capgemini.jpa.manytomany.entity.Person;

public interface PersonService {

	public Set<Person> addPerson(Set<Person> person);

	public Person getPersonById(int id);
}
