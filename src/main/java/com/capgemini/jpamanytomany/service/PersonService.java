package com.capgemini.jpamanytomany.service;

import java.util.Set;

import com.capgemini.jpamanytomany.entity.Person;
import com.capgemini.jpamanytomany.entity.Project;

public interface PersonService {
	// public void addNew(Person person);
	public Person findPersonById(int id);

	void addNewPerson(Set<Person> person);

	void addNewProject(Set<Project> project);

	/*
	 * public void addNewProject(Project project3);
	 * 
	 * public void addNewPerson(Person person1);
	 */
}
