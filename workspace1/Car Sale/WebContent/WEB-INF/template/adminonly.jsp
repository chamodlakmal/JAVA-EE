<%@page import="com.im.carsale.utils.UrlHelper"%>
<%
	Object roleObject=session.getAttribute("ROLE");
	if(roleObject!=null&& roleObject.toString().equals("a")){
		
	}else
	{
		response.sendRedirect(UrlHelper.base_url()+"login.jsp");
	}
	 %>