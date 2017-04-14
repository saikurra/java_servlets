<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome Home</h1>
	<h3>This is the demo of using Servlet to display JSP page.</h3>
	<h3>Username value from Servlet : <%=request.getAttribute("name") %></h3>
	<h3>Website value from Servlet : <%=request.getAttribute("website") %></h3>
</body>
</html>