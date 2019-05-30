<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="WEB-INF/parts/head.jsp" %>
<title>IM</title>
</head>
<body>

	<%@ include file="WEB-INF/parts/header.jsp" %>
	<%
		Date date=new Date();
		
		out.println(date);
		
		
		
		
	 %>
	 
	<%@ include file="WEB-INF/parts/footer.jsp" %>
</body>
</html>