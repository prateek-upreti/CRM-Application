<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h2>Lead Converted to Contact</h2>
	<p>Lead ${lead.firstName} ${lead.lastName} has been Converted.</p>
	<table border="l">
		<tr>
			<th>ID</th>
			<td>${lead.id}</td>
		</tr>
		<tr>
			<th>First Name</th>
			<td>${lead.firstName}</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${lead.lastName}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${lead.email}</td>
		</tr>
		<tr>
			<th>Mobile</th>
			<td>${lead.mobile}</td>
		</tr>
	</table>
</body>
</html>




















