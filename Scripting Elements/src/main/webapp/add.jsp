<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Welcome With JSP </title>
</head>
<body bgcolor="blue" >
	<%! int f = 55; %>
	<% 
	 	int x = Integer.parseInt(request.getParameter("num1"));
    	int y = Integer.parseInt(request.getParameter("num2"));
    	int z = x+y;
    	out.println("Result add is "+z);
    %>
    My Fav Number Is : <%= f%>
</body>
</html>