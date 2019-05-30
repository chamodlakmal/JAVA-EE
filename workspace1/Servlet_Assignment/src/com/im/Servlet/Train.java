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

@WebServlet("/training")
public class Train extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();	  
	    resp.setContentType("text/html");
	    
	    out.println("<html>");
	   
	    out.println("<body>");
	    try {
	        String parent = null;
	        String realPath = req.getRealPath("/train.html");
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
	    out.println("<div class='container-fluid' >");
	    out.println("<img src='" + req.getRealPath("/images/TTC_home_imgFacilitiesE2.jpg") + "' alt='image' style='height: 460px; width: 100%;margin-top:10px;' />"); 
	    out.println("</div>");
	    out.println("<script>\r\n" + 
	    		"	function t()\r\n" + 
	    		"	{\r\n" + 
	    		"		var d = new Date();\r\n" + 
	    		"		document.getElementById(\"demo\").innerHTML = d;\r\n" + 
	    		"		setTimeout(\"t()\", 1000);\r\n" + 
	    		"	}\r\n" + 
	    		"	onload=t;\r\n" + 
	    		"</script>");
	    out.println("<h1 style='color:#8a00c1;text-align:center;font-weight:bold;' id=\"demo\"></h1>");
	    out.println("</body></html>");
	    out.close();
	}

}
