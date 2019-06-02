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
		
		<div class="panel panel-default">
		  <div class="panel-heading">Registration Page</div>
		  <div class="panel-body">
		  		<s:form action="registration" method="post" enctype="multipart/form-data">
		  			<s:textfield name="member.name" label="Your Name" size="150%" cssClass="form-control"></s:textfield>
		  			<s:textfield name="member.email" label="Your Email" cssClass="form-control"></s:textfield>
		  			<s:textfield name="member.mobile" label="Your Mobile" cssClass="form-control"></s:textfield>
		  			<s:textarea name="member.address" label="Your Address" cssClass="form-control"></s:textarea>
		  			<s:file name="member.photo" label="Your Image" cssClass="form-control"></s:file>
		  			<s:textfield name="member.password" label="Your Password" cssClass="form-control"></s:textfield>
		  			<s:submit value="REGISTER" cssClass="btn btn-success"></s:submit>
		  		</s:form>
		  </div>
		</div>
	</div>
</body>
</html>