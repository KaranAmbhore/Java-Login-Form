<%@ page language="java" contentType="text/html; charset = UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>

<h1>Logout successful..........</h1>
	<%
	HttpSession session2 = request.getSession(false);
	
	if (session2 != null) {
		session2.invalidate();
		response.sendRedirect("index.html");
	%>


	<%
	} else {
		
	response.sendRedirect("index.html");
	}
	%>
</body>
</html>