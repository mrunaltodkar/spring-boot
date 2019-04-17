package com.capgemini.jpa.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpa.onetoone.dao.PersonDao;
import com.capgemini.jpa.onetoone.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;

	@Override
	public void addPerson(Person person) {
		dao.save(person);
	}

	public Person getPersonById(int id) {
		return dao.findById(id).get();
	}
}
