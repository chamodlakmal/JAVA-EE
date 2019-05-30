<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EBay</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<%@ include file="WEB-INF/parts/header.jsp" %>
		<s:iterator value="itemList" var="item">
			<div class="row">
						
							
							<img class="img img-thumbnail img-responsive" src="uploads/<s:property value="photoFileName"/>" width="100px" height="100px"/>
							
							<h3><s:property value="title"/></h3>
							<span><s:property value="description"/></span>
							<span><s:property value="price"/></span>
							<span><s:property value="date"/></span>
						
						</div>
					</s:iterator>
		
	</div>
</body>
</html>