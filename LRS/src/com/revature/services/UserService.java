package com.revature.services;

import java.util.ArrayList;
import java.util.Optional;

import com.revature.models.Role;
import com.revature.models.User;

/**
 * The UserService should handle the processing and retrieval of Users for the
 * LRS application.
 *
 * {@code getByUsername} is the only method required; however, additional
 * methods can be added.
 *
 * Examples:
 * <ul>
 * <li>Create User</li>
 * <li>Update User Information</li>
 * <li>Get Users by ID</li>
 * <li>Get Users by Email</li>
 * <li>Get All Users</li>
 * </ul>
 */
public class UserService {

	private ArrayList<User> userList = new ArrayList<User>();

	public UserService() {
		super();
		User user1 = new User(101, "test1234", "test1234", Role.EMPLOYEE);
		User user2 = new User(102, "abc1234", "abc1234", Role.EMPLOYEE);
		User user3 = new User(103, "admin1234", "admin1234", Role.MANAGER);
		User user4 = new User(104, "xyz1234", "xyz1234", Role.EMPLOYEE);
		User user5 = new User(105, "super1234", "super1234", Role.MANAGER);
		this.userList.add(user1);
		this.userList.add(user2);
		this.userList.add(user3);
		this.userList.add(user4);
		this.userList.add(user5);
	}

	/**
	 * Should retrieve a User with the corresponding username or an empty optional
	 * if there is no match.
	 */
	public Optional<User> getByUsername(String username) {
		
		for (User user : userList) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return Optional.of(user);
			}
		}
		return Optional.empty();
	}
}
