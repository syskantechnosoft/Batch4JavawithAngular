package com.onlinetutorialspoint.repos;


import com.onlinetutorialspoint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    Optional<User> findByFirstName(String firstname);
}
