package com.revature.image;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//This is the annotation-based mapping URL to Servlet.
@WebServlet("/Serv")

//This annotation defines the maximum file size which can be taken.
@MultipartConfig(maxFileSize = 16177215)

public class Serv extends HttpServlet {

	// auto generated
	private static final long serialVersionUID = 1L;

	public Serv() {
		super();
	}

	// This Method takes in All the information
	// required and is used to store in the
	// MySql Database.
	public int uploadFile(String firstName, String lastName, InputStream file) {
		String sql = "INSERT INTO users (first_name, last_name,photo) values (?, ?, ?)";
		int row = 0;

		Connection connection = MyConnection.getConnection();

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			if (file != null) {
				// Fetches the input stream
				// of the upload file for
				// the blob column
				preparedStatement.setBlob(3, file);
			}

			// Sends the statement to
			// the database server
			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return row;
	}

	// As Submit button is hit from
	// the Web Page, request is made
	// to this Servlet and
	// doPost method is invoked.
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Getting the parametes from web page
		String firstName = request.getParameter("firstName");

		String lastName = request.getParameter("lastName");

		// Input stream of the upload file
		InputStream inputStream = null;

		String message = null;

		// Obtains the upload file
		// part in this multipart request
		Part filePart = request.getPart("photo");

		if (filePart != null) {

			// Prints out some information
			// for debugging
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());

			// Obtains input stream of the upload file
			inputStream = filePart.getInputStream();
		}

		// Sends the statement to the database server
		int row = uploadFile(firstName, lastName, inputStream);
		if (row > 0) {
			message = "File uploaded and saved into database";
		}
		System.out.println(message);
	}
}
