<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Post your add</title>
<link href="source.css" rel="stylesheet" type="text/css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://fonts.googleapis.com/css?family=Righteous" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid" id="section1">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<div class="row">
						<div class="col-md-6" style="margin-top:3px;">
							<h2 style="color: white;font-weight: bold; font-family: 'Righteous', cursive;"><i class="fas fa-car" style="padding-right:10px;font-size:30px;"></i>Car Sale</h2>
						</div>
						<div class="col-md-6" style="margin-top: 28px;"><a class="sec1_txt" href="#" style="text-decoration: none;color:rgba(255,255,255,.9);text-shadow: 0 1px #007168;
						line-height: 20px;
						border-radius: 20px;
						border: solid 1px #085151;
						background-color: #0d705a;
						margin-top: 25px;
						padding-top: 5px;
						padding-bottom: 5px;
						text-align: center;
						padding-right: 10px;
						padding-left: 10px;">All ads</a>
						
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="row" style="margin-top: 28px;">
						<div class="col-md-4"><a href="#" style="text-decoration: none;padding-top:8px;padding-bottom:8px;padding:8px; color:white;border-bottom-left-radius: 20px;border-top-left-radius: 20px;border: solid 1px #045151;padding-top=100px;">Sinhala</a><a href="#"style="text-decoration: none;padding:8px; color:white;border-bottom-right-radius: 20px;border-top-right-radius: 20px;border: solid 1px #045151;">Tamil</a></div>		
					</div>
				</div>
				<div class="col-md-4" style="margin-top:30px;">
					<div class="row" >
						<div class="col-md-2">
							<i class="fas fa-comments" style="color:white;border:solid 1px #045151;border-radius:20px;padding:8px;margin-top:-10px;"></i>
						</div>
						<div class="col-md-1">
							<i class="fas fa-user" style="color:white;"></i>
						</div>
						<div class="col-md-3"> <a style="color:white;font-weight:bold;margin-left:-10px;">Log In</a> </div>
						<div class="col-md-6"><button type="button" class="btn btn-warning"style="color:#673500;font-weight:bold;margin-top:-10px;">Post your ad</button></div>
					</div>
				</div>
			</div>
			<div class="row">
			</div>
		</div>
	</div>

	<div class="container-fluid" style="background-color: #e7edee">
		<div class="container" style="margin-top: 20px;background-color: white;border-radius: 10px;">
			<div class="row">
				<div class="col-md-8">
					<h3>Sell an item or service</h3>
					<hr>
					<form>
  					<div class="form-group">
   					 <h5>Category:</h5>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
					<form>
  					<div class="form-group">
   					 <h5>Location:</h5>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
					
					<h3>Add photos (5 for free)</h3>
					<hr>
					<div class="row" style="border: solid 1px #d4ded9;margin-left:5px;">
						<div class="col-md-4">
							<i class="fas fa-image" style="font-size: 150px;color: #d4ded9;"></i>
						</div>
						<div class="col-md-8">
							<button type="button" class="btn btn-primary"style="width: 100%;background-color: #128e73;margin-top: 50px;height: 50px;font-weight: bold;font-size: 20px;">Add a photo</button>
						</div>
					</div>
					<h3>Fill in the details</h3>
					<hr>
					
					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Brand</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Model</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Trim / Edition (optional)</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Model year</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<h5>Condition</h5>
					<hr>
					<label class="radio-inline"><input type="radio" name="optradio" checked>New</label>
					<label class="radio-inline"><input type="radio" name="optradio" >Used</label>
					<label class="radio-inline"><input type="radio" name="optradio" >Reconditioned</label>
					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Mileage (km)</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Body type (optional)</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Transmission</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<label class="checkbox-inline">Fuel type:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" value="">Diesel</label>
					<label class="checkbox-inline"><input type="checkbox" value="">Petrol</label>
					<label class="checkbox-inline"><input type="checkbox" value="">CNG</label>
					<label class="checkbox-inline"><input type="checkbox" value="">Other fuel type</label>
					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Engine capacity (cc)</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<div class="form-group">
  					<label for="comment">Description:</label>
  					<textarea class="form-control" rows="5" id="comment"></textarea>
					</div>
					<div class="row">
						<div class="col-md-6">
							<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Price (Rs)</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
						</div>
						<div class="col-md-6">
							<label class="checkbox-inline"style="margin-top: 60px;"><input type="checkbox" value="">Negotiable</label>
						</div>
					</div>
  					<h3>Contact details</h3>
					<hr>
					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Name</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Phone number</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<form style="margin-top: 30px;">
  					<div class="form-group">
   					 <label>Email</label>
    				<input class="form-control input-sm" id="inputsm" type="text">
  					</div>
  					</form>
  					<button type="button" class="btn btn-primary" style="background-color: #128e73;height: 40px;margin-left: 10px;width: 100px;margin-bottom:50px;">Post ad</button>
				</div>
			</div>
			
		</div>
		<div class="container">
			<p style="margin-top: 10px;font-size: 12px;font-style: italic;">By posting this ad, you agree to the Terms & Conditions of this site</p>
		</div>
		<div class="container"style="background-color: white;">
			<h2>Quick rules</h2>
			<h2>All ads posted on ikman.lk must follow our rules:</h2>
			<div class="row" style="color: #707676;margin-bottom:30px;">
				<div class="col-md-6">
					<ul>
						<li>Make sure you post in the correct category.</li>
						<li>Do not post the same ad more than once or repost an ad within 7 days.</li>
						<li>Do not upload pictures with watermarks.</li>
					</ul>
				</div>
				<div class="col-md-6">
					<ul>
						<li>Do not post ads containing multiple items unless it's a package deal.</li>
						<li>Do not put your email or phone numbers in the title or description.</li>
						
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="container-fluid"id="section5" style="background-color: white;border-top:solid 4px #128e73;">
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<h5 style="margin-left: -3px;">Download our app</h5>
				<br>
				<br>
				<div class="row">
					<div class="col-md-6">
						<img src="images/1280px-Get_it_on_Google_play.svg.png" style="width: 100%;">
					</div>
					<div class="col-md-6">
						<img src="images/app-store-coupon-my-new.png" style="width: 100%;">
					</div>
				</div>
				<h5 style="margin-left: -3px;">Connect with us</h5>
				<br><br>
						<a style="color: #0074ba;font-weight: bold;"href="#"><i class="fab fa-facebook-square" style="color: blue;font-size: 25px;margin-right:10px; padding-top: 5px;"></i>Like us on Facebook</a>
					
			</div>	
				
			<div class="col-md-2">
				<h5>Learn More</h5>
				<br>
				<br>
				<ul>
					<li><a href="#">How to sell fast</a></li>
					<li><a href="#">Buy Now on car.lk</a></li>
					<li><a href="#">Membership</a></li>
					<li><a href="#">Bannner Advertising</a></li>
					<li><a href="#">Promote your ad</a></li>
				</ul>
			</div>	
			<div class="col-md-2">
				<h5>Help & Support</h5><br>
				<br>
				<ul>
					<li><a href="#">FAQ</a></li>
					<li><a href="#">Stay safe on car.lk</a></li>
					<li><a href="#">Contact us</a></li>
					
				</ul>
			</div>	
			<div class="col-md-2">
				<h5>Social</h5><br>
				<br>
				<ul>
					<li><a href="#">Blog</a></li>
					<li><a href="#">Facebook</a></li>
					<li><a href="#">Twitter</a></li>
					<li><a href="#">YouTube</a></li>
					<li><a href="#">Google+</a></li>
				</ul>
			</div>	
			<div class="col-md-2">
				<h5>About us</h5><br>
				<br>
				<ul>
					<li><a href="#">About us</a></li>
					<li><a href="#">Career</a></li>
					<li><a href="#">Terms & Condition</a></li>
					<li><a href="#">Privacy Policy</a></li>
					<li><a href="#">Site</a></li>
				</ul>
			</div>	
		</div>
		<hr>
		<p style="font-size: 12px;">Copyright &copy; Saltside Technologies</p>
		<p style="color: black;font-weight: bold; font-family: 'Righteous', cursive;float: right;margin-top: -30px;"><i class="fas fa-car" style="padding-right:10px;font-size:20px;color:black"></i>Car Sale</p>
	</div>
</div>
</body>
</html>