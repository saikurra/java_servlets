package com.coursesinc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("views/form.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h3> FormServlet recieved values successfully </h3>");
		out.println("<ul>");
		out.println("<li> Name:" +request.getParameter("emp_name") +"</li>");
		/*out.println("<li> ID:" +request.getParameter("emp_id")+"</li>");
		out.println("<li> Password:" +request.getParameter("emp_password")+"</li>");
		out.println("<li> Email:" +request.getParameter("emp_email")+"</li>");
		out.println("<li> Phone:" +request.getParameter("emp_phone")+"</li>");
		out.println("<li> Gender Radio:" +request.getParameter("emp_gender")+"</li>");
		out.println("<li> Car Select:" +request.getParameter("emp_car")+"</li>");
		out.println("<li> Hobbies Checkbox: ");
		String[] hobbies = request.getParameterValues("emp_hobbies");
		for(String hobby: hobbies){
			out.print(hobby+", ");
		}
		out.println("</li>");
		out.println("</ul>");*/
	}
}
