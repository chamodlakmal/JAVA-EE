package com.im.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/")
public class Main extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String h1="<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>IM</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<h1>Industrial Master</h1>";
		out.println(h1);
		Date date=new Date();
		
		out.println(date);
		out.println("</body>\r\n" + 
				"</html>");
	}
}
