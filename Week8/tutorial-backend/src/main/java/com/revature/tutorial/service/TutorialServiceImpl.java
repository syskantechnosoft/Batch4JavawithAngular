package com.revature.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.tutorial.model.Tutorial;
import com.revature.tutorial.repo.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	TutorialRepository tutorialRepository;

	@Override
	public List<Tutorial> findAll() {
		// TODO Auto-generated method stub
		return tutorialRepository.findAll();
	}

	@Override
	public Tutorial findById(long id) {
		// TODO Auto-generated method stub
		return tutorialRepository.getById(id);
	}

	@Override
	public void save(Tutorial tutorial) {
		// TODO Auto-generated method stub
		tutorialRepository.save(tutorial);

	}

	@Override
	public void update(long id, Tutorial tutorial) {
		// TODO Auto-generated method stub
		tutorial.setId(id);
		tutorialRepository.save(tutorial);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		tutorialRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		tutorialRepository.deleteAll();
	}

	@Override
	public List<Tutorial> findByPublished(boolean published) {
		// TODO Auto-generated method stub
		return tutorialRepository.findByPublished(published);
	}

	@Override
	public List<Tutorial> findByTitleContaining(String title) {
		// TODO Auto-generated method stub
		return tutorialRepository.findByTitleContaining(title);
	}

}
