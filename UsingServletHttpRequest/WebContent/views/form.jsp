<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<div>
	<h4>Demo Form Inputs Example</h4>
		<form action="employees/" method="POST">
			Text: <input name="emp_name" type="text" placeholder="Enter your username"/>
			<br>
			Number:<input name="emp_id" type="number" placeholder="Enter your employee ID"/>
			<br>
			Password:<input name="emp_password" type="password" placeholder="Enter your password"/>
			<br>
			Email:<input name="emp_email" type="email" placeholder="Enter your email"/>
			<input type="submit" value="Save">
		</form>
	</div>
</body>
</html>