package com.capgemini.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.rest.dao.PersonDao;
import com.capgemini.rest.entity.Person;

//@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;

	@Override
	public Person addPerson(Person person) {
		return dao.save(person);

	}
	
	@Override
	public List<Person> getPerson(){
		return dao.findAll();
		
	}
	
	@Override
	public Person findById(int personId) {
		return dao.findById(personId).get();
	}
}
