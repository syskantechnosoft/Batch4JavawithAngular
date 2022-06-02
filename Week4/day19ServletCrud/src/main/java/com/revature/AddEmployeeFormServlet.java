package com.revature;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeFormServlet")
public class AddEmployeeFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddEmployeeFormServlet() {
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
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<head> <title> Add Employee Form </title> </head>");
		out.println("<body> <form method='GET' action='AddEmployeeServlet'> <table> <tr> <th> Column Name </th> <th> Column Value </th> </tr>");
		out.println("<tr> <td>Enter Employee First Name : </td> <td> <input type='text' name='fname' /> </td> </tr>");
		out.println("<tr> <td>Enter Employee Last Name : </td> <td> <input type='text' name='lname' /> </td> </tr>");
		out.println("<tr> <td>Enter Employee Email : </td> <td> <input type='email' name='email' /></td> </tr>");
		out.println("<tr> <td>Enter Employee Mobile : </td> <td><input type='number' name='phone' /> </td> </tr>");
		out.println(
				"<tr> <td> <input type='reset' value='Clear Data' /> </td> <td><input type='submit' value='Add Employee' /> </td></tr>");
		out.println("</table> </form> </body>");
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
