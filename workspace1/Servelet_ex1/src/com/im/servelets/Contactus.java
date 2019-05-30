package com.im.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Contact")
public class Contactus extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("<html> <title>Contact Us</title> <div style='background-color:pink;width:100%;padding:1em;'><h2 style='color:green;'>Industrial Master</h2> ");
		out.println("<p>Train your mind</p>");
		out.println("<button style=''>Click Here</button>");
		out.println("</div>");
		out.println("<h3>Contact US </h3> ");
		out.println("<hr>");
		out.println("<form action=\"/action_page.php\">\r\n" + 
				"  First name:<br>\r\n" + 
				"  <input type=\"text\" name=\"firstname\" value=\"Mickey\">\r\n" + 
				"  <br>\r\n" + 
				"  Last name:<br>\r\n" + 
				"  <input type=\"text\" name=\"lastname\" value=\"Mouse\">\r\n" + 
				"  <br><br>\r\n" + 
				"  <input type=\"submit\" value=\"Submit\">\r\n" + 
				"</form> ");
		out.println("</html>");
	}

}
