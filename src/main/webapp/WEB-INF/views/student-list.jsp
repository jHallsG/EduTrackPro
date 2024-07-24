<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students List</title>
</head>
<body>
	<h1 align = center> EduTrackPro </h1>
	<hr>
	<div align = "center">
		<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONE</th>
			<th>ADDRESS</th>
		</tr>
		
		<c:forEach var="student" items="${students}">
		<tr align = "center">
			<td>${student.id}</td>
			<td>${student.name}</td>
			<td>${student.phone}</td>
			<td>${student.address}</td>
          </tr>
        </c:forEach>
	
	</table>
	</div>
</body>
</html>