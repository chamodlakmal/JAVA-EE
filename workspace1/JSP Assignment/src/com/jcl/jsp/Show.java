package com.jcl.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;
import com.sun.corba.se.pept.transport.Connection;
@WebServlet("/show")
public class Show extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/studentms";
			java.sql.Connection con=DriverManager.getConnection(url, "root", "");
			String query="SELECT * from register where id=?";
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement(query);
			ps.setInt(1, id1);
			ResultSet rs=ps.executeQuery();
			
			out.println("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\r\n" + 
					"\r\n" + 
					"<!-- jQuery library -->\r\n" + 
					"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n" + 
					"\r\n" + 
					"<!-- Latest compiled JavaScript -->\r\n" + 
					"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\r\n" + 
					"</head>\r\n" + 
					"<body>");
			
			out.println("<div class=\"container\">");
			boolean var=rs.next();
			if(!var)
			{
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Id is not Found ..');");  
				out.println("</script>");
			}
			while(var)
			{
				
				String id2=rs.getString("id");
				String name2=rs.getString("name");
				String marks2=rs.getString("marks");
				
				
				out.println("<table style=\"width:60%\">\r\n"); 
						
					
				out.println("<td><h2 style='font-weight:bold;margin-bottom:-10px;'>ID</h2><hr><br><h5 style='margin-top:-20px;'>"+id2+"</h5></td>"); 
				out.println("<td><h2 style='font-weight:bold;margin-bottom:-10px;'>Name</h2 ><hr><br><h5 style='margin-top:-20px;'>"+name2+"</h5></td>");
				out.println("<td><h2 style='font-weight:bold;margin-bottom:-10px;'>Marks</h2><hr><br><h5 style='margin-top:-20px;'>"+marks2+"</h5></td> </table>");
				var=rs.next();
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		out.println("</div></body></html>");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}

}
