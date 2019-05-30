<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank You</title>
<%@ include file="WEB-INF/template/head.jsp" %>
</head>
<body>
	<div class="container">	
	<%@ include file="WEB-INF/template/header.jsp" %>
	<div class="row" id="content"><!-- content -->
			<div class="col-md-3" >
			<div class="list-group">
				
			</div>
			

		</div>
		<div class="col-md-9" >
			<h2 style="color:red;">OOPS We got Some error......</h2>
			<img  src="images/1496946239error.jpg" class="img img-responsive">
			<p>
			Error:
			<%=exception.getMessage() %></p>
			<hr>
		
			
          
          
          	</div>
          	
          	<div class="row">
          		<div class="col-md-12">
  </div>
          	</div>
          </div>
		</div>
		</div><!--content -->
		
		
	</div>
<%@ include file="WEB-INF/template/footer.jsp" %>
</body>
</html>