package com.coursesinc.servlets.usinghttpservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employees/")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getContextPath();
		request.getHeaderNames();
		request.getLocale();
		
		PrintWriter out = response.getWriter();
		out.println("<h3> Using HttpRequest object </h3>");
		out.println("<ul>");
		out.println("<li> Parameters Recieved:  ");
		Enumeration<String> parametersEnum = request.getParameterNames();
		while(parametersEnum.hasMoreElements()){
			out.print(parametersEnum.nextElement()+", ");
		}
		out.println("</li>");
		out.println("<li> Getting Parameter by name: " +request.getParameter("emp_name") +"</li>");
		out.println("<li> Content type: " +request.getContentType() +"</li>");
		out.println("<li> Content length: " +request.getContentLength() +"</li>");
		out.println("<li> Server to which request came : " +request.getServerName() +"</li>");
		out.println("<li> Server port recieved request : " +request.getServerPort() +"</li>");
		out.println("<li> Locale : " +request.getLocale() +"</li>");
		out.println("<li> ContextPath : " +request.getContextPath() +"</li>");
		out.println("</li>");
		out.println("</ul>");
	}

}
