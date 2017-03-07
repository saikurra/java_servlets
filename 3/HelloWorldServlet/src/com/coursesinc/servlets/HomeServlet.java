package com.coursesinc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * This method will be executed when GET request comes to 
	 * URL:http://localhost:8080/HelloWorldServlet/
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Setting response HTML
		PrintWriter out = response.getWriter();
		out.println("<h3> HelloWorld: I am HomeServlet using Annotation @WebServlet</h3>");
	}

}
