package com.revature.model;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private short status;

	public User(int id, String username, String password, String email, short status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
	}

	public User() {
		super();
	}

	public User(String username, String password, String email, short status) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}
