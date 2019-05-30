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
		
		<div class="row">
			<div class="col-md-3">
				<ul class="nav nav-pills nav-stacked">
				  <li class="active"><a href="#">Dash Board</a></li>
				  <li><a href="items">ITEMS</a></li>
				  <li><a href="members">MEMBERS</a></li>
				  <li><a href="orders">ORDERS</a></li>
				</ul>
			</div>
			<div class="col-md-9">
				<div class="panel panel-default">
				  <div class="panel-heading">
				  Item List
				  <a href="item_add.jsp" class="btn btn-success"> + </a>
				  </div>
				  <div class="panel-body">
					<table class="table">
					<tr> <th>Image</th><th>Title</th><th>Description</th><th>Price</th><th>Date</th>
					</tr>
					<s:iterator value="itemList" var="item">
						<tr>
							<td>
							<img src="uploads/<s:property value="photoFileName"/>" width="100px" height="100px"/>
							</td>
							<td><s:property value="title"/></td>
							<td><s:property value="description"/></td>
							<td><s:property value="price"/></td>
							<td><s:property value="date"/></td>
						</tr>
					</s:iterator>
					</table>
				  </div>
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>	