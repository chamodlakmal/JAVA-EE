<%@page import="java.util.Date"%> <!-- Page directive element eke import eka pawichchi karana akaraya -->
<%@ page session="true"  isThreadSafe="true"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page info="Mokak hari bailayk" %>
<%@page errorPage="WEB-INF/parts/error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
// Date d=null;
// int year=d.getYear();


	Date today=new Date();
	String sid= session.getId();
	out.println("session id = "+sid);
	
	long start=session.getCreationTime();
	long now=today.getTime();
	long dif=(now-start)/1000;
	out.println("<br> You browsed  since "+dif);
	
	long last=session.getLastAccessedTime();
	long inac=(now-last)/1000;
	
	 out.println("<br> Inactive time "+inac);
	
 %>

<c:if test="${ 10>5}">
<h1>10 is greater </h1>
</c:if>

<s:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/dbems" user="root" password=""/>
	 <s:query dataSource="${db}" var="result"> SELECT * from category; </s:query> 
	 <table border="1" width="100%"> 
	 <tr> <th>ID</th> <th>Name</th>  </tr>
	  <c:forEach var="row" items="${result.rows}">
	   <tr> <td><c:out value="${row.id}"/></td> <td><c:out value="${row.name}"/> </tr> 
	  </c:forEach> 
	 </table>
</body>
</html>