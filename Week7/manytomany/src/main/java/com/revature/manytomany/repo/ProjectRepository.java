package com.revature.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.manytomany.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
