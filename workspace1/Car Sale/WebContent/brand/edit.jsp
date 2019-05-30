<%@page import="com.im.carsale.model.Brand"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
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
				Configuration confi = new Configuration();
				SessionFactory sf = confi.configure().buildSessionFactory();
				Session session1=sf.openSession();
				session1.beginTransaction();
				Brand br=(Brand)session1.get(Brand.class,id);
				String name="";
				if(br!=null)
				{
					name=br.getName();
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
          </div>
		</div>
		</div><!--content -->
		
		
	</div>
<%@ include file="../WEB-INF/template/footer.jsp" %>
</body>
</html>