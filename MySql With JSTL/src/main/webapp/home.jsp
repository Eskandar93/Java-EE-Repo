<%@page import="jakarta.servlet.jsp.PageContext"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Welcome With JSP </title>
	</head>
	<body>
		<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/jstldb" user="root" password="root" />
		<sql:query var="rs" dataSource="${db}"> select *from product</sql:query>
		<c:forEach items="${rs.rows}" var="it">
			<br>
			<c:out value="${it.id }"></c:out>:
			<c:out value="${it.name }"></c:out>:
			<c:out value="${it.price }"></c:out>
		</c:forEach>
	</body>
</html>