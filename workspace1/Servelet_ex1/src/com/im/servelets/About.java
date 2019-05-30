package com.im.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/About")
public class About extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		out.println("<html> <title>About Us</title> <div style='background-color:pink;width:100%;padding:1em;'><h2>Industrial Master</h2> ");
		out.println("<p>Change your mind</p>");
		out.println("<button>Click Here</button>");
		out.println("<a href='About'>About us</a>");
		out.println("<a href='Contact'>Contact us</a>");
		out.println("</div></html>");
	}
	

}
