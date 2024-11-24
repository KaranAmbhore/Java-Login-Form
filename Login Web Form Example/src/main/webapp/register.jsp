<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link rel=stylesheet href=register.css>

</head>
<body>

	<div class=container>
		<form action="RegisterServlet" method=post>
			<label for="username"> UserName :</label>
			 <input type=text name=username id=username required> <br>
			<label for = email > Email : </label>
			<input type = email name =email id = email required>	 <br>
		 <label	for="password"> PassWord :</label> <input type=password name=pass
				id=pass required> <br>
				
			<button type="submit">Register</button>
		</form>

		<p>
			<a href=index.html> Back To Home</a>
		</p>
		</div>
</body>
</html>