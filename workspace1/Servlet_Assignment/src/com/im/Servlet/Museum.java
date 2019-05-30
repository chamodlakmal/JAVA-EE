package com.im.Servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/museum")
public class Museum extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();	  
	    resp.setContentType("text/html");
	    
	    out.println("<html>");
	   
	    out.println("<body>");
	    try {
	        String parent = null;
	        String realPath = req.getRealPath("/museum.html");
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
	    out.println("<div class='container-fluid'>");
	    out.println("<img src='" + req.getRealPath("/images/tex slider image fro buddika.png") + "' alt='image' style='height: 560px; width: 100%' />");
	    out.println("</div>");
	    out.close();
	    out.println("</body></html>");
	    
	    
		
	    
	}
}
