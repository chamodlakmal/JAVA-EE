package com.im.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.pept.transport.Connection;

import sun.text.resources.cldr.af.FormatData_af_NA;

@WebServlet("/")
public class MyServlet extends HttpServlet {
	int hour;
	int min;
	@Override
	public void init() throws ServletException {
		Random n=new Random();
		hour=n.nextInt(24);
		min=n.nextInt(60);
	}
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		
		out.println("<html> <title>About</title> <div style='background-color:pink;width:100%;'><h2>Hello World</h2> ");
		out.println("<p>");
		out.println("</div></html>");
		Date today=new Date();
		out.println(today);
		
		out.println("<h1>Today Luck time :"+hour +":"+min+"</h1>");
		
		try {
			Class.forName("com.mysql..jdbc,Driver");
			String url="jdbc:mysql://localhost:3306/dbName";
			Connection con=(Connection) DriverManager.getConnection(url,"root", "");
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement("SELECT * from target");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String name=rs.getString("name");
				out.println("<h2>"+name+"</h2>");
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	 
	 @Override
	public void destroy() {
		
	}
}
