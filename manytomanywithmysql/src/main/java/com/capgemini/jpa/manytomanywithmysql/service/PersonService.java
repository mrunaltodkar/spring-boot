package com.capgemini.jpa.manytomanywithmysql.service;

import java.util.Set;

import com.capgemini.jpa.manytomanywithmysql.entity.Person;

public interface PersonService {

	public Set<Person> addPerson(Set<Person> person);

	public Person getPersonById(int id);
}
