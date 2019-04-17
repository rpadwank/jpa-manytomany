package com.capgemini.jpamanytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpamanytomany.entity.Project;
@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

}
