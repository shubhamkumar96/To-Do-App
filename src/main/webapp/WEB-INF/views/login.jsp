<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<title> To-Do's</title>
		<style>
			.footer {
				position: absolute;
				bottom: 0;
				width: 100%;
				height: 60px;
				background-color: #f5f5f5;
			}
		</style>
	</head>
	<body>
		<nav class="navbar navbar-default">
			<a href="/" class="navbar-brand">Brand</a>
			<ul class="nav navbar-nav">
				<li class="active"> <a href="#"> HOME </a> </li>
				<li> <a href="/list-todo.do"> Todos </a> </li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li> <a href="/login"> LOGIN </a> </li>
			</ul>
		</nav>
		
		<div class ="container">
			<h1>${errorMessage}</h1>
			<h2>Please Enter Your Credentials Below </h2>
			<form action="/login" method="post">
				Enter Your Name : <input type="text" name="name"/>
				<br>
				Enter Your Password : <input type="password" name="password"/>
				<br>
				<input type="submit"/>
			</form>
		</div>
		
		<footer class="footer">
			<p> Footer Content </p>
		</footer>
		
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
</html>