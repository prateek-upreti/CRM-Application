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
	<form action="saveLead" method="post">
	<h2>Create Lead</h2>
	<p>Lead Information</p>
		First Name <input type="text" name="firstName"><br>
		Last Name <input type="text" name="lastName"><br>
		Email <input type="text" name="email"><br>
		Mobile <input type="text" name="mobile"><br>
		Source
		<select name="leadSource">
			<option value="Facebook">Facebook</option>
			<option value="Instagram">Instagram</option>
			<option value="Youtube">Youtube</option>
			<option value="Online">Online</option>
		</select><br>
		<input type="submit" value="Save">
	</form>
</body>
</html>