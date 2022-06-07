package com.revature.repositories;

import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

public class UserDAO {

	/**
	 * Should retrieve a User from the DB with the corresponding username or an
	 * empty optional if there is no match.
	 */
	public Optional<User> getByUsername(String username) {
		Optional<User> optionalUser = Optional.empty();
		try {
			Connection conn = ConnectionFactory.getInstance().getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user_table where username='" + username + "'");
			if (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				if (rs.getString("role").equalsIgnoreCase("manager")) {
					user.setRole(Role.FINANCE_MANAGER);
				} else if (rs.getString("role").equalsIgnoreCase("employee")) {
					user.setRole(Role.EMPLOYEE);
				}
				optionalUser = Optional.of(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return optionalUser;
	}

	/**
	 * <ul>
	 * <li>Should Insert a new User record into the DB with the provided
	 * information.</li>
	 * <li>Should throw an exception if the creation is unsuccessful.</li>
	 * <li>Should return a User object with an updated ID.</li>
	 * </ul>
	 *
	 * Note: The userToBeRegistered will have an id=0, and username and password
	 * will not be null. Additional fields may be null.
	 */
	public User create(User userToBeRegistered) {
		return userToBeRegistered;
	}
}
