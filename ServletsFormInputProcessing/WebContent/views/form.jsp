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
			<br>
			Phone:<input name="emp_phone" type="phone" placeholder="Enter your phone number"/>
			<br>
			Radio:<input name="emp_gender" type="radio" value="male">Male
				  <input name="emp_gender" type="radio" value="female">Female
			<br>
			Hobbies Checkbox:<input name="emp_hobbies" type="checkbox" value="movies">Movies
				  <input name="emp_hobbies" type="checkbox" value="tennis">Tennis
				  <input name="emp_hobbies" type="checkbox" value="basketball">Basketball
			<br>
			Car Select: <select name="emp_car">
					  <option value="volvo">Volvo</option>
					  <option value="saab">Saab</option>
					  <option value="mercedes">Mercedes</option>
					  <option value="audi">Audi</option>
					</select>
			<br>
			<input type="submit" value="Save">
		</form>
	</div>
</body>
</html>