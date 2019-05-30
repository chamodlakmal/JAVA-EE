<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.im.carsale.utils.DB"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Sale</title>
<%@ include file="../WEB-INF/template/head.jsp" %>
</head>
<body>
	<div class="container">	
	<%@ include file="../WEB-INF/template/header.jsp" %>
	<%@ include file="../WEB-INF/template/memberonly.jsp" %>
	<div class="row" id="content"><!-- content -->
			<div class="col-md-3" >
			<div class="list-group">
				<img  src="../images/sitebar.jpg" class="img img-responsive">
			</div>
			

		</div>
		<div class="col-md-9" >
			<h2>Post Your Car</h2>
			<hr>
			<form action="../car_add_action" method="post">
			
				<label>Title:</label>
				<input type="text" class="form-control" name="title"/>
				<label>Brand:</label>
				<select name="brand-id">
				<option value="0">Select Brand</option>
				<% 
						Connection con=DB.getConnection();
						String sql="SELECT * from brand";
						PreparedStatement ps=con.prepareStatement(sql);
						ResultSet rs=ps.executeQuery();
						while(rs.next())
						{
						String name=rs.getString("name");
						String id=rs.getString("id");
							
						
					 %>
					 <option value="<%=id%>"><%=name %></option>
					 <%} %>
				
				</select>
				<label>Model:</label>
				<select name="model-id">
				<option value="0">Select Model</option>
				<% 
						
						String sql1="SELECT * from model";
						PreparedStatement ps1=con.prepareStatement(sql1);
						ResultSet rs1=ps1.executeQuery();
						while(rs1.next())
						{
						String name=rs1.getString("name");
						String id=rs1.getString("id");
							
						
					 %>
					 <option value="<%=id%>"><%=name %></option>
					 <%} %>
				</select>
				<label>Fuel Type:</label>
				<select name="fuel-id">
				<option value="0">Select Fuel Type</option>
				<% 
						
						String sql2="SELECT * from fuel_type";
						PreparedStatement ps2=con.prepareStatement(sql2);
						ResultSet rs2=ps2.executeQuery();
						while(rs2.next())
						{
						String name=rs2.getString("name");
						String id=rs2.getString("id");
							
						
					 %>
					 <option value="<%=id%>"><%=name %></option>
					 <%} %>
				</select><br>
				<label>Discription:</label>
				<textarea type="text" class="form-control" name="description"></textarea>
				<label>Milage:</label>
				<input type="number" class="form-control" name="milage"/>
				<label>Year:</label>
				<input type="number" class="form-control" name="year"/>
				<label>Price:</label>
				<input type="number" class="form-control" name="price"/>
				<label>Condition:</label>
					<input type="radio" name="condition" value="R" id="unreg">
					
				<label for="unreg">Un-Registered</label>
					<input type="radio" name="condition" value="U" >
					<label for="unreg">Registered</label><br>
				 <label >Photo</label>
				 <input type="file" class="btn btn-info" name="photo"/>
				
				<input type="reset" class="btn btn-info" value="Reset"/>
				<input type="submit" class="btn btn-success" value="Register"/>
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
<%@ include file="../WEB-INF/template/footer.jsp" %>
</body>
</html>