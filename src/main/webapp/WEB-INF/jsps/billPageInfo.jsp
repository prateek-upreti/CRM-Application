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
	<h2>Bill Generated</h2>
	<p>Bill for ${bill.firstName} ${bill.lastName} has been Generated.</p>
	<table border="l">
		<tr>
			<th>ID</th>
			<td>${bill.id}</td>
		</tr>
		<tr>
			<th>First Name</th>
			<td>${bill.firstName}</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${bill.lastName}</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${bill.email}</td>
		</tr>
		<tr>
			<th>Mobile</th>
			<td>${bill.mobile}</td>
		</tr>
		<tr>
			<th>Product</th>
			<td>${bill.product}</td>
		</tr>
		<tr>
			<th>Amount</th>
			<td>${contact.amount}</td>
		</tr>
	</table>
</body>
</html>




















