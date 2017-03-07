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
		<h4>Demo GET: Submitting form using HTTP Method- GET</h4>
		<form action="employees/" method="GET">
			<input name="firstname" type="text" placeholder="Enter your firstname"/>
			<br>
			<input name="lastname" type="text" placeholder="Enter your lastname"/>
			<br>
			<input type="submit" value="Search"/>
		</form>
	</div>
	<div>
	<h4>Demo POST: Submitting form using HTTP Method- POST</h4>
		<form action="employees/" method="POST">
			<input name="firstname" type="text" placeholder="Enter your firstname"/>
			<br>
			<input name="lastname" type="text" placeholder="Enter your lastname"/>
			<br>
			<input type="submit" value="Save"/>
		</form>
	</div>
</body>
</html>