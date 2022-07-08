package com.revature.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.music.model.Song;
import com.revature.music.repo.SongRepository;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	SongRepository songRepository;

	@Override
	public List<Song> getAllSongs() {
		// TODO Auto-generated method stub
		return songRepository.findAll();
	}

	@Override
	public Song getSongById(int id) {
		// TODO Auto-generated method stub
		return songRepository.findById(id).get();
	}

	@Override
	public void addSong(Song song) {
		// TODO Auto-generated method stub
		songRepository.save(song);
	}

	@Override
	public void deleteSongById(int id) {
		// TODO Auto-generated method stub
		songRepository.deleteById(id);
	}

	@Override
	public void updateSong(int id, Song song) {
		// TODO Auto-generated method stub
		songRepository.save(song);
	}

}
