<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Employee Form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Demo Form Inputs Example</h2>
		<br>
		<table class="table table-striped">
			<form method="POST" action="formSubmit">
				<tr>
					<td>Username</td>
					<td><input name="emp_name" type="text"
						placeholder="Enter your username" /></td>
				</tr>
				<tr>
					<td>User Id</td>
					<td><input name="emp_id" type="number"
						placeholder="Enter your employee ID" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="emp_password" type="password"
						placeholder="Enter your password" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input name="emp_email" type="email"
						placeholder="Enter your email" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input name="emp_phone" type="phone"
						placeholder="Enter your phone number" /></td>
				</tr>
				<tr>
					<td>Radio</td>
					<td><input name="emp_gender" type="radio" value="male">Male
						<input name="emp_gender" type="radio" value="female">Female</td>
				</tr>
				<tr>
					<td>Hobbies Checkbox</td>
					<td><input name="emp_hobbies" type="checkbox" value="movies">Movies
						<input name="emp_hobbies" type="checkbox" value="tennis">Tennis
						<input name="emp_hobbies" type="checkbox" value="basketball">Basketball</td>
				</tr>
				<tr>
					<td>Car Select</td>
					<td><select name="emp_car">
					<option value="volvo">Volvo</option>
					<option value="saab">Saab</option>
					<option value="mercedes">Mercedes</option>
					<option value="audi">Audi</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn btn-info" type="submit" value="Save"></td>
				</tr>
			</form>
		</table>
	</div>
</body>
</html>