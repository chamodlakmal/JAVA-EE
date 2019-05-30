<%@page import="java.sql.ResultSet"%>
<%@page import="com.im.carsale.utils.DB"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.im.carsale.utils.UrlHelper"%>
<div class="list-group">
				<%
				Object role=session.getAttribute("ROLE");
				if(role!=null&&role.toString().equals("a")){
				
				 %>
  				<a href="<%=UrlHelper.base_url() %>brand/list.jsp" class="list-group-item active">Brands</a>
  				<a href="<%=UrlHelper.base_url() %>model/list.jsp" class="list-group-item">Models</a>
  				<a href="<%=UrlHelper.base_url() %>car/list.jsp" class="list-group-item">Cars</a>
  				<a href="<%=UrlHelper.base_url() %>fuel type/list.jsp" class="list-group-item">Fuel Type</a>
  				<a href="<%=UrlHelper.base_url() %>member/list.jsp" class="list-group-item">Member</a>
  				<%}else if(role!=null&&role.toString().equals("m")){ %>
  				<a href="<%=UrlHelper.base_url() %>member/mylist.jsp" class="list-group-item">My Cars</a>
  				<a href="<%=UrlHelper.base_url() %>member/profile.jsp" class="list-group-item">My Profile</a>
  				<%} %>
  				<div class="list-group-item">
  				<form action="<%=UrlHelper.base_url() %>index.jsp">
  				<h4>Filter By</h4>
  				
  				<label>Brand:</label>
				<select name="brand" class="form-control">
				<option value="0">Select brand</option>
				<% 
						Connection con1=DB.getConnection();
						String sql1="SELECT * from brand";
						PreparedStatement ps1=con1.prepareStatement(sql1);
						ResultSet rs1=ps1.executeQuery();
						while(rs1.next())
						{
						String name=rs1.getString("name");
						String id=rs1.getString("id");
							
						
					 %>
					 <option value="<%=id%>"><%=name %></option>
					 <%} %>
				</select>
  				
  				<br>
  				<label>Model:</label>
				<select name="model" class="form-control">
				<option value="0">Select Model</option>
				<% 
						Connection con5=DB.getConnection();
						String sql5="SELECT * from model";
						PreparedStatement ps5=con5.prepareStatement(sql5);
						ResultSet rs5=ps5.executeQuery();
						while(rs5.next())
						{
						String name=rs5.getString("name");
						String id=rs5.getString("id");
							
						
					 %>
					 <option value="<%=id%>"><%=name %></option>
					 <%} %>
				</select>
  				<button class="btn btn-info">Apply</button>
  				</form>
  				</div>
			</div>