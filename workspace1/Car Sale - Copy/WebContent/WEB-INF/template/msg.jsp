<%
String msg=request.getParameter("msg");
			if(request.getParameter("msg")!=null){ %>
			<div class="alert alert-<%=(request.getParameter("msg").contains("Success"))?"success":"danger"%>">
				<%=msg %>
			</div>
			<%} %>