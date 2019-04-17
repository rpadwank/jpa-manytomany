package com.capgemini.jpamanytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpamanytomany.entity.Person;
import com.capgemini.jpamanytomany.entity.Project;
import com.capgemini.jpamanytomany.service.PersonService;

@RestController
public class ManyToManyController {

	@Autowired
	PersonService service;

	@RequestMapping("/")
	public void setPerson() {
		Set<Person> personP1 = new HashSet<Person>();
		Set<Person> personP2 = new HashSet<Person>();
		Set<Person> personP3 = new HashSet<Person>();
		Set<Project> projectPer1 = new HashSet<Project>();
		Set<Project> projectPer2 = new HashSet<Project>();
		Set<Project> projectPer3 = new HashSet<Project>();
		Project project1 = new Project(501, "AWS");
		Project project2 = new Project(502, "Java");
		Project project3 = new Project(503, "Python");
		Person person1 = new Person(101, "Ruchir");
		Person person2 = new Person(102, "Dipti");
		Person person3 = new Person(103, "Mark");
		personP1.add(person1);
		personP1.add(person2);
		personP2.add(person3);
		personP3.add(person1);
		project1.setPerson(personP1);
		project2.setPerson(personP2);
		project3.setPerson(personP3);
		projectPer1.add(project1);
		projectPer1.add(project3);
		projectPer2.add(project1);
		projectPer3.add(project2);
		/*
		 * person1.setProject(projectPer1); person2.setProject(projectPer2);
		 * person3.setProject(projectPer3);
		 * 
		 * service.addNewPerson(person1); service.addNewPerson(person2);
		 * service.addNewPerson(person3);
		 * 
		 * service.addNewProject(project1); service.addNewProject(project2);
		 * service.addNewProject(project3);
		 */

		service.addNewPerson(personP1);
		service.addNewPerson(personP2);
		service.addNewPerson(personP3);
		service.addNewProject(projectPer1);
		service.addNewProject(projectPer2);
		service.addNewProject(projectPer3);

	}

	@RequestMapping("/new")
	public Set<Person> getPerson() {
		Set<Person> person = new HashSet<Person>();
		for (int i = 101; i < 104; i++) {
			person.add(service.findPersonById(i));

		}
		return person;
	}

}
