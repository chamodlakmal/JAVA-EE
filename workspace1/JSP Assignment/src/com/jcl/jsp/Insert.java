package com.jcl.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.sun.corba.se.pept.transport.Connection;

@WebServlet("/insert")
public class Insert extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String id=req.getParameter("id");
		int id1=Integer.parseInt(id);
		String name=req.getParameter("name");
		String marks=req.getParameter("marks");
		int marks1=Integer.parseInt(marks);		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/studentms";
		java.sql.Connection con=DriverManager.getConnection(url, "root", "");		
		String query="Insert into register value (?,?,?)";
		PreparedStatement ps=((java.sql.Connection) con).prepareStatement(query);
		ps.setInt(1, id1);
		ps.setString(2, name);
		ps.setInt(3, marks1);
		
		ps.executeUpdate();
	    out.println("<h5>Data is Stored ...</h5>");  
		
	} catch (Exception e) {
		e.printStackTrace();
		out.println("<script type=\"text/javascript\">");  
		out.println("alert('Data is not Stored..');");  
		out.println("</script>");
	}
}
}
