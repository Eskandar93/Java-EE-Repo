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
	     Welcome Add Jsp page
	     <%
	     	/*try{
	     		int k = 9/0;
	     	}catch(Exception e){
	     		out.println("Error "+e.getMessage());
	     	}*/
	     	int k = 9/0;
	     %>
	</body>
</html>