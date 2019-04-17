package com.capgemini.jpamanytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpamanytomany.dao.PersonDao;
import com.capgemini.jpamanytomany.dao.ProjectDao;
import com.capgemini.jpamanytomany.entity.Person;
import com.capgemini.jpamanytomany.entity.Project;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao dao;

	@Autowired
	private ProjectDao pdao;

	@Override
	public void addNewPerson(Set<Person> person) { // dao.save(person);
		dao.saveAll(person); // dao.sa

	}

	@Override
	public Person findPersonById(int id) {
		Person person = dao.findById(id).get();
		return person;
	}

	
	  @Override public void addNewProject(Set<Project> project) {
	  pdao.saveAll(project);
	  
	  }
	 
}
