<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="row" style="margin-top: 30px;">
	<div class="col-md-3"></div>
	<div class="col-md-6" style="border-top:1px solid black;border-left:1px solid black;border-right:1px solid black;" >
	<img src="images/googlelogo_color_272x92dp.png" style="width:20%;height:10%;
  margin-top:20px;">
	
	<h4>Create your google Account</h4>
		
	</div>
	<div class="col-md-3"></div>
	</div>
	<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6" style="text-align:center;border-bottom:1px solid black;border-left:1px solid black;border-right:1px solid black;">
  <div class="form-group">
 	<div class="row">
 		
 		<style type="text/css">
			.label{
				color: #888;
			}
		</style>
 		<s:form action="registration" method="post" enctype="multipart/form-data">
		  			<s:textfield name="user.name" label="First Name" size="150%" cssClass="form-control"></s:textfield>
		  			
		  			<s:textfield name="user.email" label="Email" cssClass="form-control"></s:textfield>
		  			
		  			
		  			<s:textfield name="user.mobile" label="Phone" cssClass="form-control"></s:textfield>
		  			
		  			<s:submit value="REGISTER" cssClass="btn btn-success"></s:submit>
		  		</s:form>
 		
 	</div>

</div>
		
	</div>
	<div class="col-md-3"></div>
	</div>
</div>
	

</body>
</html>