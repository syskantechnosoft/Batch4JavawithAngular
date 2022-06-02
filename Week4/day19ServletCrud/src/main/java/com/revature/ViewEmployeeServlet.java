package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewEmployeeServlet
 */
@WebServlet("/ViewEmployeeServlet")
public class ViewEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewEmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); // sending html response
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_schema", "root", "root");
			Statement stmt = conn.createStatement();

			// int id = 0;
			// Scanner scan = new Scanner(System.in);
//			System.out.print("Enter ID of the Employee to view: ");
//			//id = scan.nextInt();
			ResultSet rs = stmt.executeQuery("select * from employee");
			out.println("<head> <title> View Employees </title> </head>");
			out.println(" <b> Employee Table contents </b>");
			out.println(
					"<table border='1'> <tr> <th>Sl No </th> <th>First Name </th> <th> Last Name</th> <th>Email </th> <th>Mobile </th> <th>Actions</th> </tr>");
			while (rs.next()) {
				out.println("<tr> <td>" + rs.getInt(1) + " </td> <td> " + rs.getString(2) + " </td> <td> "
						+ rs.getString("last_name") + "</td> <td> " + rs.getString(4) + " </td> <td> " + rs.getLong(5)
						+ "</td> <td> <a href='EditServlet?id=" + rs.getInt(1)
						+ "'> Edit </a> || <a href='DeleteServlet?id=" + rs.getInt(1) + "'>Delete </a>  </td></tr>");
			}
			out.println("</table>");

			// scan.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
