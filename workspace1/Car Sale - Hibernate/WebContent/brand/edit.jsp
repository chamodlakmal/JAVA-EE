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
			<h2>Edit A Brand</h2>
			<hr>
			<%@ include file="../WEB-INF/template/msg.jsp" %>
			<form action="../brand_update_action" method="post">
			
			<%
				String id=request.getParameter("id");
				Connection con=DB.getConnection();
				String sql="SELECT * FROM brand WHERE id=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, id);
				ResultSet rs=ps.executeQuery();
				String name="";
				if(rs.next())
				{
				name=rs.getString("name");
				}
			
			 %>
			 <label>ID:</label>
				<input value="<%=id %>" readonly type="text" class="form-control" name="id"/>
				<label>Name:</label>
				<input value="<%=name %>" type="text" class="form-control" name="name"/>
				
				
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