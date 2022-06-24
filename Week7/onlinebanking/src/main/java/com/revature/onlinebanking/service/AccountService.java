package com.revature.onlinebanking.service;

import java.util.List;

import com.revature.onlinebanking.model.Account;

public interface AccountService {

	public List<Account> getAll(); // Read All operation

	public Account getById(int id); // Read by ID operation

	public void save(Account account);

	public void update(int id, Account account);

	public void deleteById(int id);
}
