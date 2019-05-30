<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Upload Video</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<div class="row" style="padding-top: 20px;">
			<div class="col-md-4">
				<div class="row">
					<div class="col-md-3" style="text-align: center;padding-right: 50px;font-size: 25px;">
						<i class="fas fa-bars"></i>
					</div>
					<div class="col-md-5">
                       <img src="images/images.png" style="padding-bottom: 20px;padding-right: 50px;width: 100%">
					</div>
					<div class="col-md-5">
                       
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<form>
				  <div class="input-group">
				    <input type="text" class="form-control" placeholder="Search">
				    <div class="input-group-btn">
				      <button class="btn btn-default" type="submit">
				        <i class="glyphicon glyphicon-search"></i>
				      </button>
				    </div>
				  </div>
				</form>
			</div>
			<div class="col-md-4" >
				<div class="row" style="padding-top: 7px;text-align: center;font-size: 18px;">
					<div class="col-md-4">
						
					</div>
					<div class="col-md-1">
						<a href="upload.jsp"style="color: black;"><i class="fas fa-video-slash"></i></a>
					</div>
					<div class="col-md-1">
						<a href="#"style="color: black;"><i class="fas fa-braille"></i></a>
					</div>
					<div class="col-md-1">
						<a href="#"style="color: black;"><i class="fas fa-comment"></i></a>
					</div>
					<div class="col-md-1">
						<a href="#"style="color: black;"><i class="fas fa-bell"></i></a>
					</div>
					<div class="col-md-3"><a style="color: black;" href="sign1.jsp">Sign In</a></div>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid" style="background-color:#dbdbdb; ">
		<div class="container">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-6" style="background-color:#fff;margin-top: 20px;padding: 20px;padding-top: 100px;margin-bottom: 20px;">
				<a href="#" style="height: 35px;width: 120px;margin: 0 auto;display: flex; justify-content: center;" class="btn btn-info">Upload the file</a>
				<h5 style="text-align: center;padding: 20px;">
					Select files to Upload
				</h5>
				<h6 style="text-align: center;">Or drag and drop video files</h6>
			</div>
			<div class="col-md-2"></div>
			<div class="col-md-2"></div>
		</div>
		</div>
	</div>

</body>
</html>