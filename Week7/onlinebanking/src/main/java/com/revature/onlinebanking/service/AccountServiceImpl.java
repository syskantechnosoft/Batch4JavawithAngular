package com.revature.onlinebanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.onlinebanking.model.Account;
import com.revature.onlinebanking.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public Account getById(int id) {
		// TODO Auto-generated method stub
		return accountRepository.findById(id).get();
	}

	@Override
	public void save(Account account) {
		// TODO Auto-generated method stub
		accountRepository.save(account);
	}

	@Override
	public void update(int id, Account account) {
		// TODO Auto-generated method stub
		accountRepository.save(account);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(id);
	}

}
