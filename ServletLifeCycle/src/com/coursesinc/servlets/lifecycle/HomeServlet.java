package com.coursesinc.servlets.lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String message;

	public void init(ServletConfig config) throws ServletException {
		message = "I am from Servlet init() lifecycle method ";
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h3>" + message + "</h3>");
	}

	public void destroy() {
		/*
		 * this method is used to close any resources like BufferReader before
		 * destroying the Servlet
		 */
	}
}
