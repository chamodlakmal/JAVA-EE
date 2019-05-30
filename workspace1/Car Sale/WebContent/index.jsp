<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.im.carsale.utils.DB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Sale</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/common.css">
</head>
<body>
	<div class="container">	
	<%@ include file="WEB-INF/template/header.jsp" %>
	<div class="row" id="content"><!-- content -->
			<div class="col-md-3" >
			<%@ include file="WEB-INF/template/sitebar.jsp" %>
		</div>
		<div class="col-md-9" >
		<nav class="navbar navbar-inverse">
 		 <div class="container-fluid" style="background-color:#0f46c6">
    		<form class="navbar-form navbar-left" action="index.jsp">
      				<div class="form-group">
                   <input type="text" class="form-control" placeholder="Search" name="search">
               </div>
             <button type="submit" class="btn btn-default">Submit</button>
          </form>
           </div>
          </nav>
          <%
          				String p=request.getParameter("p");
          				if(p==null)
          				{
          				p="1";
          				}
          				int pageNo=Integer.parseInt(p);
          				int limit=5;
          				int offset=(pageNo-1)*5;
          				
           			String search=request.getParameter("search");
          				String where="";
          				if(search!=null&&!search.equals(""))
          				{
          					where+="WHERE car.title LIKE '%"+search+"%'";
          				}
          				String brand=request.getParameter("brand");
          				if(brand!=null&&!brand.equals("0"))
          				{
          					if(where.equals(""))
          					{
          						where+=" where ";
          					}else
          					{
          						where+=" AND ";
          					}
          					where +=" model.brand_id ='"+brand+"'";
          				}
          				
          				String model=request.getParameter("model");
          				if(brand!=null&&!brand.equals("0"))
          				{
          					if(where.equals(""))
          					{
          						where+=" where ";
          					}else
          					{
          						where+=" AND ";
          					}
          					where +=" car.model_id ='"+model+"' ";
          				}
						Connection conIndex=DB.getConnection();
						String sql="SELECT * FROM (((car INNER JOIN user ON car.user_id = user.id) INNER JOIN model ON model.id =car.model_id )INNER JOIN brand ON brand.id=model.brand_id)"+where+" LIMIT "+limit+" OFFSET "+offset;
						PreparedStatement psIndex=conIndex.prepareStatement(sql);
						ResultSet rsIndex=psIndex.executeQuery();
						while(rsIndex.next())
						{
						String id=rsIndex.getString("car.id");
						String brandName=rsIndex.getString("brand.name");
						String modelName=rsIndex.getString("model.name");
						String title=rsIndex.getString("car.title");
						String price=rsIndex.getString("car.price");
						String member=rsIndex.getString("user.name");
						String milage=rsIndex.getString("milage");	
					 %>
          <div class="row well well-lg">
          	<div class="col-md-3">
          		<img  src="images/default.png" class="img img-responsive img-thumbonail">
          	</div>
          	<div class="col-md-9">
          	<h3><%=title %></h3>
          	<p style="color:green"><%=milage %> km</p>
          	<h6>Rs :<%=price %></h6>
          	</div>
          	</div>
          <%} %>
          <div class="row">
          		<div class="col-md-12">
          		<ul class="pagination">
          <%
          int recordCount=0;
          	String sqlCount="SELECT COUNT(car.id) FROM (((car INNER JOIN user ON car.user_id = user.id) INNER JOIN model ON model.id =car.model_id )INNER JOIN brand ON brand.id=model.brand_id) "+where;
          	PreparedStatement pscount=conIndex.prepareStatement(sqlCount);
          	ResultSet rsCount=pscount.executeQuery();
          	
          	if(rsCount.next())
          	{
          		recordCount=rsCount.getInt(1);
          	}
          	int pageCount=(recordCount/limit);
          	if(recordCount%limit!=0)
          	{
          	pageCount++;
          	}
          	for(int i=0;i<pageCount;i++)
          	{
          	String active="";
          	if(i+1==pageNo)
          	{
          		active="active";
          		}
           %>	
          	
          		
				  <li  class="<%=active %>" ><a href="?p=<%=i+1%>"><%=i+1 %></a></li>
				  
				
          	<%} %>
          	</ul></div>
          	</div>
          </div>
		</div>
		</div><!--content -->
		
		
	</div>
<%@ include file="WEB-INF/template/footer.jsp" %>
</body>
</html>