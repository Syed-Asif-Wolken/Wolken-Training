<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<body>
<h2>Welcome to Spring</h2>
<h3>${msg}</h3>
<h4>Monument Name: 		${data.name}</h4>
<h4>Monument Location: 	${data.location}</h4>
<h4>Monument Builder:	${data.builder}</h4>
<h4>Monument YOC:		${data.year}</h4>
</body>
</html>