<%@page import="com.im.carsale.utils.UrlHelper"%>
<%
	Object roleObject=session.getAttribute("ROLE");
	if(roleObject!=null){
		
	}else
	{
		response.sendRedirect(UrlHelper.base_url()+"login.jsp");
	}
	 %>