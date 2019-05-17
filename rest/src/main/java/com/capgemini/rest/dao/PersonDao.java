package com.capgemini.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.rest.entity.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

	
}
