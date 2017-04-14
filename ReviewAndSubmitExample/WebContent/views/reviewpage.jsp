<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Review Page</title>
</head>
<body>
	<h3>Here are the details you have submitted, please review</h3>
	<p>In this example you are taking values from form.jsp and sending
		those values to reveiwpage.jsp through FormServlet doPost() method</p>
	<table>
		<tr>
			<td>Name</td>
			<td><%=request.getAttribute("name")%></td>
		<tr>
		<tr>
			<td>Id</td>
			<td><%=request.getAttribute("id")%></td>
		<tr>
		<tr>
			<td>Password</td>
			<td><%=request.getAttribute("password")%></td>
		<tr>
		<tr>
			<td>Email</td>
			<td><%=request.getAttribute("email")%></td>
		<tr>
		<tr>
			<td>Gender</td>
			<td><%=request.getAttribute("gender")%></td>
		<tr>
		<tr>
			<td>Car</td>
			<td><%=request.getAttribute("car")%></td>
		<tr>
	</table>
</body>
</html>