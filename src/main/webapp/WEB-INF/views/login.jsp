<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!! from JSP</title>
</head>
<body>
	<h1>${errorMessage}</h1>
	<h2>Please Enter Your Credentials Below </h2>
	<form action="/login.do" method="post">
		Enter Your Name : <input type="text" name="name"/>
		Enter Your Password : <input type="password" name="password"/> 
		<input type="submit"/>
	</form>
</body>
</html>