<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel=stylesheet href=login.css>
</head>
<body>
	<div class=container>

		<form action="LoginServlet" method="post">
			<label for="username">UserName :</label> 
			<input type=text name=username id=username required> <br> 
			<label for="password">Password :</label>
			<input type="password" name=pass id=pass required> <br>
			<button type = submit> Login</button>
			

		</form>
		<p>
			<a href=index.html> Back To Home</a>
		</p>
		<% String error = request.getParameter("error");
		if(error!= null && error.equals("1"))  { %>
			<p style = color:red> Invalid username or password </p>
		<% } %>
		
		<% String register = request.getParameter("registration");
		if(register != null && register.equals("success"))  { %>
			<p style = color:green> Registration Successful.Please Login </p>
		<% } %>
		
	</div>
</body>
</html>