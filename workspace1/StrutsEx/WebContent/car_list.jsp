<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Struts</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="jumbotron">
		<h1>Industrial Master</h1>
		<p>Train Your Brain</p>
		<hr>
		<a href="login.jsp" class="btn btn-success">Login</a>
		<a href="register.jsp"class="btn btn-warning"  >Register</a>
	</div>
	<s:iterator value="list" var="car">
	<div class="well">
	<h2>Title : <s:property value="#car"/></h2>
	</div>
		
	</s:iterator>
</div>


</body>
</html>