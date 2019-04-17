package com.capgemini.jpamanytomany.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int projectId;
	private String desc;
	
	@ManyToMany
	@JoinTable(name="person_project", joinColumns = @JoinColumn(name="PROJECT_ID"),
	inverseJoinColumns = @JoinColumn(name="PERSON_ID"))
	private Set<Person> person;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String desc) {
		super();
		this.projectId = projectId;
		this.desc = desc;
		//this.person = person;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	/*
	 * public Set<Person> getPerson() { return person; }
	 */

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", desc=" + desc + "]";
	}
	
	
}
