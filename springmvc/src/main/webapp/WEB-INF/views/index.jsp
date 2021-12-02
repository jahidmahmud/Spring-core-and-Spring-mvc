<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Home</h1>
<h1>Welcome Home</h1>
<h1>Called by HomeController</h1>
<%
String name=(String)request.getAttribute("name");

%>
<h1>My name is <%=name %></h1>

</body>
</html>