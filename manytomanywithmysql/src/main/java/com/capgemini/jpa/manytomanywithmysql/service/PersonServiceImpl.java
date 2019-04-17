package com.capgemini.jpa.manytomanywithmysql.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpa.manytomanywithmysql.dao.PersonDao;
import com.capgemini.jpa.manytomanywithmysql.entity.Person;

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