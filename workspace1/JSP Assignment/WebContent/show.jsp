<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show the student details</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid" style="background-color:#ebff89;padding-bottom:100px;">
	<h1 style="text-align: center;font-weight: bold;margin-bottom:20px;">Search a Student</h1>
					<form  action="show" method="post">
 <div class="container"> 
 <div class="col-md-2"></div>
 <div class="col-md-8">
 <div class="row">
	<div class="col-md-10">
		<div class="form-group">
  		<div class="row">
	<div class="col-md-3" style="padding-top:10px;"><label for="usr">Search By ID:</label></div>
	<div class="col-md-9"><input type="text" class="form-control"  name="id"></div>
</div>
  
  
	</div>
	</div>
	<div class="col-md-2"><button type="submit" class="btn btn-success">Search</button></div>
	
</div>

      
</form>
</div>
<div class="col-md-2"></div>
</div>

</div>
</body>
</html>