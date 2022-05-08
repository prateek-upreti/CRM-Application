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
	<h2>Lead Information</h2>
	<p>Customer Data</p>
	<table border="l">
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
		<tr>
			<th>Lead Source</th>
			<td>${lead.leadSource}</td>
		</tr>
	</table>
	<form action="convertInfo" method="post">
		<input type="hidden" name="id" value="${lead.id}"><br>
		<input type="submit" value="Convert-Contact">
	
	</form>
</body>
</html>




















