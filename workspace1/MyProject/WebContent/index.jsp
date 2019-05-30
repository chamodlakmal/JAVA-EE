<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="source.css">
</head>
<body>

	
	<%
	for(int i=0;i<1000;i++)
	{
	%>
		<div class="container-fluid">
		<div class="container">
		<div class="row" style="border=1px solid black;">
			<div class="col-md-2">
				<img src="images/default-display-image-car-638815e7606c67291ff77fd17e1dbb16.png" style="width=100%">
			</div>
			<div class="col-md-10">
				<h3>Honda</h3>
				<h4>Rs.1000</h4>
			</div>
		</div>
	</div>
	</div>
	<%
	}%>

</body>
</html>