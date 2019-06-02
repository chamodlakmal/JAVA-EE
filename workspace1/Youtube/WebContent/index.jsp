<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Youtube</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
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
	<div class="container-fluid" style="background-color: #f0f0f0;">
		<div class="row">
			<div class="col-md-2" style="background-color: #e9e9e9;" >
				<div class="list-group" style="padding-left: -10px;background-color: #e9e9e9;">
				  <a href="#" class="list-group-item disabled"style="border-style: none;">
				  	<div class="row">
				  		<div class="col-md-2"><i class="fas fa-home"></i></div>
				  		<div class="col-md-10">Home</div>
				  	</div>
				  </a>
				  <a href="#" class="list-group-item"style="border-style: none;background-color: #e9e9e9;">
				  	<div class="row">
				  		<div class="col-md-2"><i class="fas fa-fire"></i></div>
				  		<div class="col-md-10">Trending</div>
				  	</div>
				  </a>
				  <a href="#" class="list-group-item"style="border-style: none;background-color: #e9e9e9;">
				  	<div class="row">
				  		<div class="col-md-2"><i class="fas fa-folder"></i></div>
				  		<div class="col-md-10">Library</div>
				  	</div>
				  </a>
				  <hr>
				   <a href="#" class="list-group-item"style="border-style: none;background-color: #e9e9e9;">
				  	<div class="row">
				  		<div class="col-md-2"><i class="fas fa-history"></i></div>
				  		<div class="col-md-10">History</div>
				  	</div>
				  </a>
				   <a href="#" class="list-group-item"style="border-style: none;background-color: #e9e9e9;">
				  	<div class="row">
				  		<div class="col-md-2"><i class="fas fa-clock"></i></div>
				  		<div class="col-md-10">Watch later</div>
				  	</div>
				  </a>
				   <a href="#" class="list-group-item" style="border-style: none;background-color: #e9e9e9;">
				  	<div class="row">
				  		<div class="col-md-2"><i class="fas fa-thumbs-up"></i></div>
				  		<div class="col-md-10">Liked Videos</div>
				  	</div>
				  </a>
				  
				</div>

			</div>
			<div class="col-md-10" style="padding:50px;">
				<div class="row">
				<h5 style="font-weight:bold;margin-left:20px;">Recommended</h5>
				<div class="col-md-2">
				<%
					for(int j=0;j<6;j++)
						{
						%>
						<img  src="images/video-default.png" style="width:100%;">
						<h5>Sample Title</h4>
						<h6>Sample Name</h5>
						<h6>Views : 255K </h5>
						<br>
						
				<% 			
						}
				 %>
					
				</div>
				<div class="col-md-2">
					<%
					for(int j=0;j<6;j++)
						{
						%>
						<img  src="images/video-default.png" style="width:100%;">
						<h5>Sample Title</h4>
						<h6>Sample Name</h5>
						<h6>Views : 255K </h5>
						<br>
						
				<% 			
						}
				 %>
				</div>
				<div class="col-md-2">
					<%
					for(int j=0;j<6;j++)
						{
						%>
						<img  src="images/video-default.png" style="width:100%;">
						<h5>Sample Title</h4>
						<h6>Sample Name</h5>
						<h6>Views : 255K </h5>
						<br>
						
				<% 			
						}
				 %>
				</div>
				<div class="col-md-2">
					<%
					for(int j=0;j<6;j++)
						{
						%>
						<img  src="images/video-default.png" style="width:100%;">
						<h5>Sample Title</h4>
						<h6>Sample Name</h5>
						<h6>Views : 255K </h5>
						<br>
						
				<% 			
						}
				 %>
				</div>
				<div class="col-md-2">
					<%
					for(int j=0;j<6;j++)
						{
						%>
						<img  src="images/video-default.png" style="width:100%;">
						<h5>Sample Title</h4>
						<h6>Sample Name</h5>
						<h6>Views : 255K </h5>
						<br>
						
				<% 			
						}
				 %>
				</div>
				<div class="col-md-2">
					<%
					for(int j=0;j<6;j++)
						{
						%>
						<img  src="images/video-default.png" style="width:100%;">
						<h5>Sample Title</h4>
						<h6>Sample Name</h5>
						<h6>Views : 255K </h5>
						<br>
						
				<% 			
						}
				 %>
				</div>
				</div>
				
			</div>
		</div>
	</div>
</body>
</html>