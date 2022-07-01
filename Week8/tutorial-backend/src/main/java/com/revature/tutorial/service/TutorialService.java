package com.revature.tutorial.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.revature.tutorial.model.Tutorial;

public interface TutorialService {
	List<Tutorial> findAll();

	Tutorial findById(long id);

	void save(Tutorial tutorial);

	void update(long id, Tutorial tutorial);

	void delete(long id);

	void deleteAll();

	List<Tutorial> findByPublished(boolean published);

	List<Tutorial> findByTitleContaining(String title);
}
