<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Page</title>
</head>
<body>
	<h2>All Contact Lead</h2>
	<p>Customer Information</p>
	<table>
	  <tr>
	  	<th>Id</th>
	    <th>First Name</th>
	    <th>Last Name</th>
	    <th>Email</th>
	    <th>Mobile</th>
	    <th>Update</th>
	    <th>Delete</th>
	     <th>Email</th>
	     <td>Bill</td>
	  </tr>
	  <c:forEach items="${lead}" var="leads">
	  <tr>
	    <td>${leads.id}</td>
	    <td>${leads.firstName}</td>
	    <td>${leads.lastName}</td>
	    <td>${leads.email}</td>
	    <td>${leads.mobile}</td>
	    <td><a href="updateContact?id=${leads.id}">Update</a></td>
	    <td><a href="delete?id=${leads.id}">Delete</a></td>
	     <td><a href="emailPage?email=${leads.email}">Email</a></td>
	    <td><a href="billPage?id=${leads.id}">Bill</a></td>
	  </tr>
	  </c:forEach>
</table>

</body>
</html>