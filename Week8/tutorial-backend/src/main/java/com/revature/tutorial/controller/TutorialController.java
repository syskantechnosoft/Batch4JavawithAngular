package com.revature.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.tutorial.model.Tutorial;
import com.revature.tutorial.service.TutorialService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TutorialController {
	@Autowired
	TutorialService tutorialService;

	@GetMapping("/tutorials")
	public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
		return ResponseEntity.status(HttpStatus.OK).body(tutorialService.findAll());
	}

	@GetMapping("/tutorials/{id}")
	public Tutorial getTutorialById(@PathVariable long id) {
		return tutorialService.findById(id);
	}

	@PostMapping("/tutorials")
	public void createTutorial(@RequestBody Tutorial tutorial) {
		tutorialService.save(tutorial);
	}

	@PutMapping("/tutorials/{id}")
	public void updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
		tutorialService.update(id, tutorial);
	}

	@DeleteMapping("/tutorials/{id}")
	public void deleteTutorial(@PathVariable("id") long id) {
		tutorialService.delete(id);
	}

	@DeleteMapping("/tutorials")
	public void deleteAllTutorials() {
		tutorialService.deleteAll();
	}

	@GetMapping("/tutorials/published")
	public List<Tutorial> findByPublished() {
//    ...
		return null;
	}
}
