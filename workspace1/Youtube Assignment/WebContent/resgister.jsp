<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<form  action="register" method="post">
  <div class="form-group">
 	<div class="row">
 		<div class="col-md-6">
 			<input type="text" class="form-control" style="margin-top:10px;" id="usr" placeholder="first name" name="firstName">
 		</div>
 		<div class="col-md-6">
 			<input type="text" class="form-control" style="margin-top:10px;" id="usr" placeholder="last name" name="lastName">
 		</div>
 		<div class="col-md-12">
 			<input type="text"value="@gmail.com" class="form-control" style="margin-top:10px;" id="usr" placeholder="User name" name="email">
 		</div>
 		<div class="col-md-6">
 			<input type="password" class="form-control" style="margin-top:10px;" id="usr" placeholder="password" name="password">
 		</div>
 		<div class="col-md-6">
 			<input type="password" class="form-control" style="margin-top:10px;" id="usr" placeholder="confirm password" name="confirmPassword">
 		</div>
 		<div class="col-md-12">
 			<input type="text" class="form-control" style="margin-top:10px;" id="usr" placeholder="Phone number" name="phone">
 		</div>
 		<div class="col-md-4">
 			<input type="text" class="form-control" style="margin-top:10px;" id="usr" placeholder="day" name="day">
 		</div>
 		<div class="col-md-4">
 			<input type="text" class="form-control" style="margin-top:10px;" id="usr" placeholder="month" name="month">
 		</div>
 		<div class="col-md-4">
 			<input type="text" class="form-control" style="margin-top:10px;" id="usr" placeholder="Year" name="year">
 		</div>
 		<div class="col-md-6">
 			<input type="text" class="form-control" style="margin-top:10px;margin-bottom: 10px;" id="usr" placeholder="Gender" name="gender">
 		</div>
 		
 	</div>
  
  <input type="submit" class="btn btn-success" style="width:50%;margin-top:5px;margin:0 auto;" value="Register"/>
</div>
	</form>	
		
	</div>
	<div class="col-md-3"></div>
	</div>
</div>
	

</body>
</html>