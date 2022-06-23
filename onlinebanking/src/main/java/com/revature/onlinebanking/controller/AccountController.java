package com.revature.onlinebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.onlinebanking.model.Account;
import com.revature.onlinebanking.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	@GetMapping("/data/account")
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return accountService.getAll();
	}

	@GetMapping("/data/account/{id}")
	public Account getById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return accountService.getById(id);
	}

	@PostMapping("/data/account")
	public void save(@RequestBody Account account) {
		// TODO Auto-generated method stub
		accountService.save(account);
	}

	@PutMapping("/data/account/{id}")
	public void update(@PathVariable int id, @RequestBody Account account) {
		// TODO Auto-generated method stub
		accountService.save(account);
	}

	@DeleteMapping("/data/account/{id}")
	public void deleteById(@PathVariable int id) {
		// TODO Auto-generated method stub
		accountService.deleteById(id);
	}

}
