<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Country List</title>
</head>
<body>
	<p>${message.get(1)}</p>
	<table border="1">
		<thead>
			<tr>
				<td>Country Name</td>
				<td>ISO Code - 2 Digit</td>
				<td>ISO Code - 3 Digit</td>
			</tr>
		</thead>
		<c:forEach items="${countries}" var="country">
		<tr>
			<td>${country.name}</td>
			<td>${country.alpha2Code}</td>
			<td>${country.alpha3Code}</td>
		</tr>
		</c:forEach>
	</table>
<p>Integrated Rest: </p><a href="http://services.groupkt.com/country/get/all">http://services.groupkt.com/country/get/all</a>
</body>
</html>
