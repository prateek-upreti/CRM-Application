<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead Page</title>
</head>
<body>
	<form action="saveUpdate" method="post">
	<h2>Create Lead</h2>
	<p>Lead Information</p>
		ID <input type="text" name="id" value="${contact.id}"><br>
		First Name <input type="text" name="firstName" value="${contact.firstName}"><br>
		Last Name <input type="text" name="lastName" value="${contact.lastName}"><br>
		Email <input type="text" name="email" value="${contact.email}"><br>
		Mobile <input type="text" name="mobile" value="${contact.mobile}"><br>
		<input type="submit" value="Update">
		<hr>
		<p>${msg}</p>
	</form>
</body>
</html>