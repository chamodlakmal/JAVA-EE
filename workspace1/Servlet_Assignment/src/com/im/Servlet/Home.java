package com.im.Servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/")
public class Home extends HttpServlet {
	Date date;
	@Override
	public void init() throws ServletException {
		date=new Date();
	    
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();	  
	    resp.setContentType("text/html");
	    
	    out.println("<html>");
	    out.println("<head>");
	   out.println("<link href=\"https://fonts.googleapis.com/css?family=Hanalei+Fill\" rel=\"stylesheet\">");
	   out.println("</head>");
	    out.println("<body>");
	    try {
	        String parent = null;
	        String realPath = req.getRealPath("/index.html");
	        File file = new File(parent, realPath);
	        FileReader fileReader = new FileReader(file);
	        BufferedReader buffReader = new BufferedReader(fileReader);
	        String buffer = new String();
	        while( (buffer = buffReader.readLine() ) != null) 
	            out.println(buffer);
	        buffReader.close();
	    } catch(IOException e){
	        out.println("Error reading file: " + e.getMessage());
	    }
	    String img1=req.getRealPath("/images/Swissvoice-home-img1.jpg");
	    String img2=req.getRealPath("images/SLTselfcare-home-main2.jpg");
	    String img3=req.getRealPath("images/Storage-home-main3.jpg");
	    out.println("<h4 style='text-align:center;color:#42f448;font-weight:bold;font-family: 'Hanalei Fill', cursive;'> Your log time is :"+date+"</h4>" ); 
	    out.println("");
	    out.println("	<div class=\"container-fluid\" style=\"border: none;margin-top:4px;\">\r\n" + 
	    		"\r\n" + 
	    		"			<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n" + 
	    		"			  <!-- Indicators -->\r\n" + 
	    		"			  <ol class=\"carousel-indicators\">\r\n" + 
	    		"			    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n" + 
	    		"			    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n" + 
	    		"			    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n" + 
	    		"			    <li data-target=\"#myCarousel\" data-slide-to=\"0\"></li>\r\n" + 
	    		"			    \r\n" + 
	    		"			    \r\n" + 
	    		"			  </ol>\r\n" + 
	    		"\r\n" + 
	    		"			  <!-- Wrapper for slides -->\r\n" + 
	    		"			  <div class=\"carousel-inner\">\r\n" + 
	    		"			    <div class=\"item active\">");
	    out.println("<img src='" + req.getRealPath("/images/Swissvoice-home-img1.jpg") + "' alt='image' style='height: 460px; width: 100%' />");
	    out.println("</div>");
	    out.println("<div class=\"item\">");
	    out.println("<img src='" + req.getRealPath("/images/SLTselfcare-home-main2.jpg") + "' alt='image' style='height: 460px; width: 100%' />");
	    out.println("</div>");
	    out.println("<div class=\"item\">");
	    out.println("<img src='" + req.getRealPath("/images/Storage-home-main3.jpg") + "' alt='image' style='height: 460px; width: 100%' />");
	    out.println("</div>");
	    out.println("<a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\r\n" + 
	    		"			    <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n" + 
	    		"			    <span class=\"sr-only\">Previous</span>\r\n" + 
	    		"			  </a>\r\n" + 
	    		"			  <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\r\n" + 
	    		"			    <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n" + 
	    		"			    <span class=\"sr-only\">Next</span>\r\n" + 
	    		"			  </a>	\r\n" + 
	    		"</div>\r\n" + 
	    		"</div>\r\n" + 
	    		"</div>");
	    
	    
	    
	    
	    
	    
	    out.println("</body></html>");
	    out.close();
	    
	    
	    
	    
	   
}
}

