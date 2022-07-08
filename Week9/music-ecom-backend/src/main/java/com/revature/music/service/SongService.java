package com.revature.music.service;

import java.util.List;

import com.revature.music.model.Song;

public interface SongService {
	List<Song> getAllSongs();

	Song getSongById(int id);

	void addSong(Song song);

	void deleteSongById(int id);

	void updateSong(int id, Song song);
}
