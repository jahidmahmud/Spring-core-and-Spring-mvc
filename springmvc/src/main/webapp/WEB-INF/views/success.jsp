<%@page import="springmvc.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	String email=request.getParameter("email");
	String password=request.getParameter("password");
%> --%>

<%-- <%
	User user=(User)request.getParameter("user");
%> --%>
<h1>${user.email}</h1>
<h1>${user.password}</h1>

<%-- <h1><%=email %></h1>
<h1><%=password %></h1> --%>
</body>
</html>