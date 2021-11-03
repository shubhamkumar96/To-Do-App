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
			<li>${todo.name} &nbsp; &nbsp; <a href="/delete-todo.do?todo=${todo.name}">DELETE</a></li>
		</c:forEach>
		
	</ol>
	<form action="/todo.do" method="post">
		Enter Your Todo : <input type="text" name="todo"/> 
		<input type="submit" value="Add"/>
	</form>
</body>
</html>