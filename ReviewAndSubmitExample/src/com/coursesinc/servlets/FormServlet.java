package com.coursesinc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formSubmit")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", request.getParameter("emp_name"));
		request.setAttribute("id", request.getParameter("emp_id"));
		request.setAttribute("password", request.getParameter("emp_password"));
		request.setAttribute("email", request.getParameter("emp_email"));
		request.setAttribute("phone", request.getParameter("emp_phone"));
		request.setAttribute("gender", request.getParameter("emp_gender"));
		request.setAttribute("car", request.getParameter("emp_car"));

		request.getRequestDispatcher("views/reviewpage.jsp").forward(request,
				response);
	}
}
