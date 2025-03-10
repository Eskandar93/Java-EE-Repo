<%@page import="jakarta.servlet.jsp.PageContext"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Welcome With JSP </title>
	</head>
	<body>
	   <c:forEach items="${students}" var="s">
	       ${s} <br/>
	   </c:forEach>
	   <c:forEach items="${students}" var="s">
	       ${s.rollno}  ${s.name} <br/>
	   </c:forEach>
	</body>
</html>