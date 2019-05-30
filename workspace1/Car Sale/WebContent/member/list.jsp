<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="com.im.carsale.model.User"%>
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
			<h2>Member List</h2>
			<hr>
			<%@ include file="../WEB-INF/template/msg.jsp" %>
			<div class="jumbotron">
				<table class="table ">
					<tr>
						<th>ID</th>
						<th>Name</th>
						
						
						<th>Mobile Number</th>
						<th>Registration Date</th>
						<th>Role</th>
						<th>Status</th>
						<th>Option</th>
					</tr>
					<% 
						Configuration config1 = new Configuration();
						SessionFactory sf = config1.configure().buildSessionFactory();
						Session session1 = sf.openSession();
						session1.beginTransaction();
						
						List<User> list=session1.createCriteria(User.class).list();
						for(User st1:list)
							{
								String name=st1.getName();
								int id=st1.getId();
								String email=st1.getEmail();
								String mobile=st1.getMobile();
								Date regDate=st1.getRegDate();
								char role6=st1.getRole();
								int stats=st1.getStatus();
						
					 %>
					 
					 <tr>
						<th><%=id%></th>
						<th><%=name %></th>
						
						<th><%=mobile %></th>
						<th><%=regDate %></th>
						
						<th>
						<% if(role6=='m')
						{	
							out.print("<h5> <span class='label label-success'>Member</span></h5></th>");
						}
						else
						{
						out.print("<h5> <span class='label label-warning'>Admin</span></h5></th>");
						} %>
						
						<th>
						<% if(stats==1)
						{	
							out.print("<h5> <span class='label label-success'>Active</span></h5></th>");
						}
						else
						{
						out.print("<h5> <span class='label label-warning'>Block</span></h5></th>");
						} %>
						
						<th>
						<a href="edit.jsp?id=<%=id%>" class="btn btn-warning"><i class="fas fa-edit"></i></a>
						<a href="../member_delete_action?id=<%=id%>" class="btn btn-danger"><i class="far fa-trash-alt"></i></a>
						<a href="show.jsp?id=<%=id%>" class="btn btn-info"><i class="fas fa-eye"></i></a>
						
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