package com.coursesinc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formSubmit")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<h4>Response from FormServlet doGet()</h4>");
		writer.println("Name: " + request.getParameter("u_name"));
		writer.println("& Age: " + request.getParameter("u_age"));
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("<h4>Response from FormServlet doPost()</h4>");
		writer.println("Name: " + request.getParameter("u_name"));
		writer.println("& Age: " + request.getParameter("u_age"));
	}
}
