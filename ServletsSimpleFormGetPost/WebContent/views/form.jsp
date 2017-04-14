<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
</head>
<body>
	<h4>Form Submit with HTTP Post Method --> This will execute
		FormServlet doPost method</h4>
	<form action="formSubmit" method="post">
		Username:
		<input type="text" name="u_name" />
		User Age:
		<input type="text" name="u_age" />
		<input type="submit">
	</form>

	<h4>Form Submit with HTTP Get Method --> This will execute
		FormServlet doGet method</h4>
	<form action="formSubmit" method="get">
		Username:
		<input type="text" name="username" />
		User Age:
		<input type="text" name="age" />
		<input type="submit">
	</form>
</body>
</html>