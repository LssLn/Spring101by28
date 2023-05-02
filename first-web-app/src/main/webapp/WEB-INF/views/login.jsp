<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
WELCOME ${name}
<% java.util.Date date = new java.util.Date(); %>
<div>Today is <%=date%></div>
</body>
</html>