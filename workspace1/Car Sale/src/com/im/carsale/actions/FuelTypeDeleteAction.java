package com.im.carsale.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.im.carsale.utils.DB;

/**
 * Servlet implementation class FuelTypeDeleteAction
 */
@WebServlet("/fueltype_delete_action")
public class FuelTypeDeleteAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		PrintWriter out=response.getWriter();
		try {
			Connection con=	DB.getConnection();
			String query="DELETE from  fuel_type where id=?";
			PreparedStatement ps=((java.sql.Connection) con).prepareStatement(query);
			ps.setString(1,id);
			ps.executeUpdate();
			response.sendRedirect("fuel type/list.jsp?msg=Success"); 
		} catch (Exception e) {
			response.sendRedirect("fuel type/list.jsp?msg=Not Delete please retry");
		}
	}

}
