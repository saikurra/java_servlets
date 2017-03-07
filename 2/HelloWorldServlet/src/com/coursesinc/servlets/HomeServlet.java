package com.coursesinc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		/*PrintWriter writer = response.getWriter();
		
		writer.append("<h1>Sai's Dashboard</h1>");
		writer.append("<h4>I am a software engineer in American Airlines</h4>");*/
		
		request.getRequestDispatcher("views/home.jsp").forward(request, response);;
	}
}
