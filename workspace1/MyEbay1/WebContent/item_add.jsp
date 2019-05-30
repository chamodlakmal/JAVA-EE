<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>EBay</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script> 
	<%@ taglib prefix="s" uri="/struts-tags" %>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1>Ebay</h1>
			<p>Find Everything You Want</p>
			<hr/>
			<a href="items" class="btn btn-success">ITEMS</a>
		</div>
	</div>
	
	<div class="row">
	
		<div class="col-md-3">
			<ul class="nav nav-pills nav-stacked">
			  <li class="active"><a href="#">Dash Board</a></li>
			  <li><a href="#">ITEMS</a></li>
			  <li><a href="#">MEMBERS</a></li>
			  <li><a href="#">ORDERS</a></li>
			</ul>
		</div>
		
		<div class="col-md-9">
			<div class="panel panel-default">
			  <div class="panel-heading">Item List</div>
			  <div class="panel-body">
			  	<s:form action="save_item" method="POST" enctype="multipart/form-data" >
			  		<s:textfield name="item.title" label="Title"></s:textfield>
			  		<s:textfield name="item.description" label="Description"></s:textfield>
			  		<s:textfield name="item.price" label="Price"></s:textfield>
			  		<s:textfield name="item.date" label="Date"></s:textfield>
			  		<s:file name="item.photo" label="Photo"></s:file>
			  		<img  src="uploads/<s:property value="item.photoFileName"/>"/>
			  		<s:submit value="Save"></s:submit>
			  	</s:form>
			  </div>
			</div>
		</div>
		
	</div>
</body>
</html>