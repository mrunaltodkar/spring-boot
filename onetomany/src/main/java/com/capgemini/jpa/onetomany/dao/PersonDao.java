package com.capgemini.jpa.onetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpa.onetomany.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
