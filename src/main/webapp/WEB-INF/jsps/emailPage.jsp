<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Page</title>
</head>
<body>
	<form action="send" method="post">
		<h2>Email Sending</h2>
		<p>Send email to customer.</p>
			To <input type="text" name="to" value="${email}"><br>
			Subject <input type="text" name="subject"><br>
			Body<br>
			<textarea rows="7" cols="50" name="body"></textarea><br>
			<input type="submit" value="Send">
			<hr>
			<p>${msg}</p>
	</form>
</body>
</html>