package com.capgemini.jpa.manytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpa.manytomany.dao.PersonDao;
import com.capgemini.jpa.manytomany.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {


	@Autowired
	PersonDao dao;


	@Override
	public Set<Person> addPerson(Set<Person> person) {
		dao.saveAll(person);
		return person;
	}

	@Override
	public Person getPersonById(int id) {
		return dao.findById(id).get();
	}

}
