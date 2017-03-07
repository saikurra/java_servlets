package com.coursesinc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employees/")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Print the form values to the console
		String name = request.getParameter("firstname") + ","
				+ request.getParameter("lastname");
		// Set response content type
		response.setContentType("text/html");

		// Setting response HTML
		PrintWriter out = response.getWriter();
		out.println("<h3> Response from GET method </h3>");
		out.println("<h1> Fullname : " + name + "</h1>");
	}

	/*
	 * This method is used to take values submitted in the form using POST
	 * request
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Print the form values to the console
		String name = request.getParameter("firstname") + ","
				+ request.getParameter("lastname");
		// Set response content type
		response.setContentType("text/html");

		// Setting response HTML
		PrintWriter out = response.getWriter();
		out.println("<h3> Response from POST method </h3>");
		out.println("<h1> Fullname : " + name + "</h1>");
	}

}
