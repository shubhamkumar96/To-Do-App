<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> To-Do's</title>
</head>
<body>
	<h1> WELCOME ${ name }</h1>
	<br>
	<h2> Below are Your To-Dos </h2>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.name}</li>
		</c:forEach>
		
	</ol>
</body>
</html>