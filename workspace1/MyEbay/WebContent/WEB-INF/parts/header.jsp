<div class="jumbotron">
			<h1> Ebay</h1>
			<p> Find Everything You Want </p>
			<hr/>
			<a href="items" class="btn btn-success"> ITEMS </a>
			
			<%
				if(session.getAttribute("NAME")!=null)
				{
					out.print("Welcome "+session.getAttribute("NAME"));
				
			 %>
			 <a href="login.jsp" class="btn btn-success"> LOG OUT </a>
			 <%
			 }else{
			 
			  %>
			<a href="login.jsp" class="btn btn-success"> LOGIN </a>
			<a href="register.jsp" class="btn btn-success"> REGISTER </a>
			<%} %>
		</div>
		
		<style type="text/css">
			.label
			{
				color:#888;
			}
		</style>