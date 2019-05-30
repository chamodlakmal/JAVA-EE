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

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();	  
	    resp.setContentType("text/html");
	    
	    out.println("<html>");
	   
	    out.println("<body>");
	    try {
	        String parent = null;
	        String realPath = req.getRealPath("/login.html");
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
	     
	    out.println("</body></html>");
	    out.close();
	}

}
