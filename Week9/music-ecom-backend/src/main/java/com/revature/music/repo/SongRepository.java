package com.revature.music.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.music.model.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {

}
