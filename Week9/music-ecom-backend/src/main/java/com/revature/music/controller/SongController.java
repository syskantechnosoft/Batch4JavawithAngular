package com.revature.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.music.model.Song;
import com.revature.music.service.SongService;

@RestController
@RequestMapping("/api/v1")
public class SongController {

	@Autowired
	SongService songService;
	
	@RequestMapping("/hello")
    public String sayHello(){
        return "Hello User!";
    }

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/songs")
	public List<Song> getAllSongs() {
		return songService.getAllSongs();
	}

	@GetMapping("/songs/{id}")
	public Song getSongById(@PathVariable int id) {
		return songService.getSongById(id);
	}

	@PostMapping("/songs")
	public void addSong(@RequestBody Song song) {
		songService.addSong(song);
	}

	@PutMapping("/songs/{id}")
	public void updateSong(@PathVariable int id, @RequestBody Song song) {
		songService.updateSong(id, song);
	}

	@DeleteMapping("/song/{id}")
	public void deleteSong(@PathVariable int id) {
		songService.deleteSongById(id);
	}
}
