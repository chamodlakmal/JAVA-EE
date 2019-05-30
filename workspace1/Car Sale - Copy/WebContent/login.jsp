<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Sale</title>
<%@ include file="WEB-INF/template/head.jsp" %>
</head>
<body>
	<div class="container">	
	<%@ include file="WEB-INF/template/header.jsp" %>
	<div class="row" id="content"><!-- content -->
			<div class="col-md-3" >
			<div class="list-group">
				<img  src="images/sitebar.jpg" class="img img-responsive">
			</div>
		</div>
		<div class="col-md-9" >
			<h2>Login Page</h2>
			<hr>
			<%@ include file="WEB-INF/template/msg.jsp" %>
			<form action="login_action" method="post">
				<label>Email:</label>
				<input type="text" class="form-control" name="email"/>
				<label>Password:</label>
				<input type="password" class="form-control" name="password"/>
				<input type="reset" class="btn btn-info" value="Reset"/>
				<input type="submit" class="btn btn-success" value="Login"/>
			</form>
			
          
          
          	</div>
          	
          	<div class="row">
          		<div class="col-md-12">
          		<ul class="pagination">
  <li class="active"><a href="#">1</a></li>
  <li ><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
</ul></div>
          	</div>
          </div>
		</div>
		</div><!--content -->
		
		
	</div>
<%@ include file="WEB-INF/template/footer.jsp" %>
</body>
</html>