package com.capgemini.jpa.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpa.onetoone.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
