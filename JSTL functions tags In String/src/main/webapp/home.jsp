<%@page import="jakarta.servlet.jsp.PageContext"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Welcome With JSP </title>
	</head>
	<body>
		<c:set var="str" value="Alex Will Be A Java Backend" />
		${str}<br>
		Length : ${fn:length(str)}<br>
		<c:forEach items="${fn:split(str,' ')}" var="s">
		${s} <br>
		</c:forEach>
		
		index :${fn:indexOf(str, "Will")}
		<br>
		is there : ${fn:contains(str, "Java") }
		<br>
		is there : ${fn:contains(str, "JSP") }
		<br>
		<c:if test="${fn:contains(str, 'Java') }">
			Java Is Most Popular
		</c:if>
		<br>
		<c:if test="${fn:endsWith(str, 'Backend') }">
			that is nice
		</c:if>
		<br>
		${fn:toLowerCase(str)}
	</body>
</html>