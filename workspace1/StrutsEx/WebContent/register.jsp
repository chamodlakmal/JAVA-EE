<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
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
		<a href="register.jsp"class="btn btn-warning">Register</a>
	</div>
	
	<h2>Register Page</h2>
	<hr>
	<form action="register" method="post">
	<div class="form-group">
			<label>Name</label>
			<input type="text" class="form-control" name="name"/>
		</div>
		<div class="form-group">
			<label>Email</label>
			<input type="text" class="form-control" name="email"/>
		</div>
		<div class="form-group">
			<label>mobile</label>
			<input type="text" class="form-control" name="mobile"/>
		</div>
		<div class="form-group">
			<label>Password</label>
			<input type="password" class="form-control" name="password"/>
		</div>
		<div class="form-group">
			
			<input type="reset" class="btn btn-info" value="RESET"/>
			<input type="submit" class="btn btn-success" value="Register"/>
		</div>
	
	</form>
</div>

</body>
</html>