<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! Date date=new Date(); %>
	
	<%!
		public void jspInit()
		{
		System.out.println("init v2....");
		}
		
		public void _jspService()
		{
		System.out.println("init v2....");
		}
		
		public void jspDestroy()
		{
		System.out.println("Destroy v2");
		
		}
	 %>
	<h1><%=date %></h1>
	
	
	<%
		for(int i=0;i<10;i++)
		out.println("<a href=''> Page "+i+"</a><br>");
		
	 %>
</body>
</html>