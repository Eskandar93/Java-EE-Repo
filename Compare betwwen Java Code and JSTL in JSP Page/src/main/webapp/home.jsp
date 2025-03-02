<%@page import="jakarta.servlet.jsp.PageContext"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Welcome With JSP </title>
	</head>
	<body>
	   <!--  <%
	   		String name = request.getAttribute("name").toString();
	        out.println(name);
	   %> -->
	   ${name}
	</body>
</html>