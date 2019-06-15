<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
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
<div class="row">
<style type="text/css">
			.label{
				color: #888;
			}
		</style>
	<div class="col-md-3"></div>
	<div class="col-md-6" >
	<img src="images/googlelogo_color_272x92dp.png" style="width:40%;height:20%;display: block;
  margin-left: auto;
  margin-right: auto;margin-top:20px;">
	<h2 style="text-align:center;;">One Account. All of Google.</h2>
	<h4 style="text-align:center;">Sign in with your Google Account.</h4>
		
	</div>
	<div class="col-md-3"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4" style="text-align:center;">
	
		<div class="jumbotron">
			<img style="display: block;
  margin-left: auto;
  margin-right: auto;width:40%"src="images/login.png">
  <s:form action="auth" method="post" enctype="multipart/form-data">
  
		  			<s:textfield name="user.email" placeholder="Your Email" size="150%" cssClass="form-control"></s:textfield>
		  			<s:password name="user.password" placeholder="Your Password" cssClass="form-control"></s:password>
		  			<s:submit value="LOGIN" cssClass="btn btn-success"></s:submit>
		  		</s:form>
  
		</div>
		<a style="text-align:center;" href="resgister.jsp">Create account</a>
	</div>
	<div class="col-md-4"></div>
	</div>
</div>
	

</body>
</html>