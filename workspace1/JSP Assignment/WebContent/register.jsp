<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register a new Student</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container-fluid" style="background-color:#ebff89;padding-bottom:100px;">	
					<h1 style="text-align: center;font-weight: bold;">Register a Student</h1>
					<form  action="insert" method="post">
 <div class="container"> 
 <div class="col-md-2"></div>
 <div class="col-md-8">
 <div class="form-group">
  <label for="usr">Id:</label>
  <input type="text" class="form-control" name="id">
</div>

  <div class="form-group">
  <label for="usr">Name:</label>
  <input type="text" class="form-control" name="name">
</div>
  
  
  <div class="form-group">
  <label for="usr">Marks:</label>
  <input type="text" class="form-control" name="marks">
</div>

  <div class="row">
  <div class="col-md-4">
  <button type="submit" class="btn btn-success" style="font-weight:bold;">Register</button></div>
  <div class="col-md-4">
  <button  class="btn btn-success" type="reset" value="Clear Fields" style="font-weight:bold;">Clear</button></div>
  </div>
  
      
    
</form>
</div>
<div class="col-md-2"></div>
</div>
			
</div>			
</body>
</html>