package com.revature.music.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.music.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
	Optional<User> findByFirstName(String firstname);
}
