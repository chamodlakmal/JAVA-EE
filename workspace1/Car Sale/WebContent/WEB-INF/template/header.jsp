<%@page import="com.im.carsale.utils.UrlHelper"%>

<div class="row" id="header"> <!-- header -->
			<div class="col-md-12" >
			<div class="jumbotron" id="banner">
				<h1>Car Sale</h1>
				<p>Find your Dream car</p>
				<hr>
				<%
					Object obj=session.getAttribute("NAME");
					if(obj==null)
					{
					
				 %>
				<a href="<%=UrlHelper.base_url() %>login.jsp" class="btn btn-warning"> LOGIN</a>
				<a href="<%=UrlHelper.base_url() %>register.jsp" class="btn btn-success"> REGISTER</a>
				<%}else{ %>
					<p>Welcome <%=obj.toString() %></p>
					<a href="<%=UrlHelper.base_url() %>car/add.jsp" class="btn btn-success" style="color:#673500;">Post Your Car</a>
					<a href="<%=UrlHelper.base_url() %>logout_action" class="btn btn-danger">LOGOUT</a>
					
				<%} %>
			</div>
		</div>
		</div><!-- header -->