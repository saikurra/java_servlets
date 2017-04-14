package com.coursesinc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class DisplayJspDemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", "Courses Inc");
		request.setAttribute("website", "http://coursesinc.com");
		request.getRequestDispatcher("views/home.jsp").forward(request, response);
	}
}
