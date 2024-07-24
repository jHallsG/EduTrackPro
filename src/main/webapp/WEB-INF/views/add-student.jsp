<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Student</title>
</head>
<body>
	<div align = center>
		<h1> New Student </h1>
		<hr>
		<form:form action = "submit" modelAttribute = "addStudent" method = "GET">
			<label for = "name"> Name </label>
			<form:input name = "name" path = "name"></form:input>
			<br>
			
			<label for = "phone"> Phone </label>
			<form:input name = "phone" path = "phone"></form:input>
			<br>
			
			<label for = "address"> Address </label>
			<form:input name = "address" path = "address"></form:input>
			<br>
			<input type = "submit" value = "Submit"></input>
		</form:form>
	</div>
	
</body>
</html>