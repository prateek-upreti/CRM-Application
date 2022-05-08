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
	<h2>All Lead Data</h2>
	<p>Customer Information</p>
	<table>
	  <tr>
	  	<th>Id</th>
	    <th>First Name</th>
	    <th>Last Name</th>
	    <th>Email</th>
	    <th>Mobile</th>
	    <th>Lead Source</th>
	    <th>Email</th>
	   
	  </tr>
	  <c:forEach items="${lead}" var="leads">
	  <tr>
	    <td>${leads.id}</td>
	    <td><a href="leadInfo?id=${leads.id}">${leads.firstName}</a></td>
	    <td>${leads.lastName}</td>
	    <td>${leads.email}</td>
	    <td>${leads.mobile}</td>
	    <td>${leads.leadSource}</td>
	    <td><a href="emailPage?email=${leads.email}">Email</a></td>
	    
	  </tr>
	  </c:forEach>
</table>

</body>
</html>