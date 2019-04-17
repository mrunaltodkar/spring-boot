package com.capgemini.jpa.manytomanywithmysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpa.manytomanywithmysql.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}

