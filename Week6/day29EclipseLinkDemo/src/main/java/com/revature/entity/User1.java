package com.revature.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the user1 database table.
 * 
 */
@Entity
@NamedQuery(name = "User1.findAll", query = "SELECT u FROM User1 u")
public class User1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String country;

	private String email;

	private String name;

	private String password;

	public User1() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User1 [id=" + id + ", country=" + country + ", email=" + email + ", name=" + name + ", password="
				+ password + "]";
	}

	
}