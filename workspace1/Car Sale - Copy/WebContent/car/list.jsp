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
	<%@ include file="../WEB-INF/template/adminonly.jsp" %>
	<div class="row" id="content"><!-- content -->
			<div class="col-md-3" >
			<div class="list-group">
				<%@ include file="../WEB-INF/template/sitebar.jsp" %>
			</div>
			

		</div>
		<div class="col-md-9" >
			<h2>Car List</h2>
			<hr>
			<a href="add.jsp" class="btn btn-success"><i class="fas fa-plus-square"></i></a>
			<%@ include file="../WEB-INF/template/msg.jsp" %>
			<div class="jumbotron">
				<table class="table ">
					<tr>
						<th>ID</th>
						<th>Brand Name</th>
						<th>Model Name</th>
						<th>Title</th>
						<th>Price</th>
						<th>Statistics</th>
						<th>Member</th>
						<th>Option</th>
					</tr>
					<% 
						Connection con=DB.getConnection();
						String sql="SELECT * FROM (((car INNER JOIN user ON car.user_id = user.id) INNER JOIN model ON model.id =car.model_id )INNER JOIN brand ON brand.id=model.brand_id)";
						PreparedStatement ps=con.prepareStatement(sql);
						ResultSet rs=ps.executeQuery();
						while(rs.next())
						{
						String id=rs.getString("car.id");
						String brandName=rs.getString("brand.name");
						String modelName=rs.getString("model.name");
						String title=rs.getString("car.title");
						String price=rs.getString("car.price");
						String member=rs.getString("user.name");
						String is=rs.getString("imp_count");
						String vc=rs.getString("view_count");
						
							
						
					 %>
					 
					 <tr>
						<th><%=id%></th>
						<th><%=brandName %></th>
						<th><%=modelName %></th>
						<th><%=title %></th>
						<th><%=price %></th>
						<th><%=is+" " %>/<%=" "+vc %></th>
						<th><%=member %></th>
						<th>
						<a href="edit.jsp?id=<%=id%>" class="btn btn-warning"><i class="fas fa-edit"></i></a>
						<a href="car_delete_action?id=<%=id%>" class="btn btn-danger"><i class="far fa-trash-alt"></i></a>
						<a href="show.jsp?id=<%=id%>" class="btn btn-info">Show</a>
						<a href="car_sold_action?id=<%=id%>" class="btn btn-success">Sold</a>
						</th>
					</tr>
					 <%} %>
					
				</table>
          
          
          	</div>
          	
          	<div class="row">
          		<div class="col-md-12">
      </div>
          	</div>
          </div>
		</div>
		</div><!--content -->
		
		
	</div>
<%@ include file="../WEB-INF/template/footer.jsp" %>
</body>
</html>