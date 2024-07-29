<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students List</title>
</head>
<body>
	<header>
			<h1 align = center> EduTrackPro </h1>
			<hr>
	</header>

	<div align = "center">
	
		<form:form action = "${pageContext.request.contextPath}/edutrackpro.com/students/add" method = "GET">
			<input type = "submit" value = "Add">
		</form:form>
	
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
			<td style = "width: 110px">
				<a href = "./update?userId=${student.id}"><button>Edit</button></a>
				<a href = "./delete?userId=${student.id}" onClick="if(!confirm('Confirm delete?')) return false"><button>Delete</button></a>
			</td>
          </tr>
        </c:forEach>
	
	</table>
	</div>
</body>
</html>