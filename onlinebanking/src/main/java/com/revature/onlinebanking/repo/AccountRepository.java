package com.revature.onlinebanking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.onlinebanking.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
