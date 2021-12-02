<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>From help file</h1>
<h1>Help at least 3 peoples a day</h1>

<% 
String name=(String)request.getAttribute("name");
%>
<h1>Hello <%=name %></h1>

</body>
</html>