package com.capgemini.jpa.manytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {

	@Id
	@Column(name = "person_id")
	private int personId;

	@Column(name = "person_name")
	private String personName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Person_Project", joinColumns = { @JoinColumn(name = "person_id") }, inverseJoinColumns = {
			@JoinColumn(name = "project_id") })
	private Set<Project> projects;

	public Person() {
		super();

	}

	public Person(int personId, String personName, Set<Project> projects) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.projects = projects;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

}
