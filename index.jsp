<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert Currency</title>
</head>
<body>
	<h1>Currency Converter</h1>
	<form action="getCurrencyServlet" method="post">
		Enter the amount of US dollars you have:
		<input type="text" name="userCurrency" size="10">
		<input type="submit" value="Calculate Currency" />
	</form>
</body>
</html>