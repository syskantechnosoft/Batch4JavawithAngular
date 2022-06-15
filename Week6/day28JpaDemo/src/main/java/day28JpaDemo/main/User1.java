package day28JpaDemo.main;

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

	public User1() {
		super();
	}

	@Id
	private int id;

	private String country;

	private String email;

	private String name;

	private String password;

	public User1(String name, String email, String password, String country) {
	
	this.name = name;
	this.password = password;
	this.email=email;
	this.country = country;
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

}