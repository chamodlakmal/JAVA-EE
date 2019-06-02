<div class="jumbotron">
			<h1> Ebay</h1>
			<p> Find Everything You Want </p>
			<hr/>
			<a href="items" class="btn btn-success"> ITEMS </a>
			
			<%
			if(session.getAttribute("NAME")!=null){
				out.print("Welcome "+session.getAttribute("NAME"));
				%>
				<a href="logout" class="btn btn-success"> LOGOUT </a>
				<%
			}else{
				%>
				<a href="register.jsp" class="btn btn-success"> REGISTER </a>
				<a href="login.jsp" class="btn btn-success"> LOGIN </a>
				<%
			}
			%>
</div>

<style type="text/css">
	.label{
		color: #888;
	}
</style>