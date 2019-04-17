package com.capgemini.jpamanytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpamanytomany.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

}
