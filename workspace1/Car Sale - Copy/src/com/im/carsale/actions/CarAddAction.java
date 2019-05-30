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
import javax.servlet.http.HttpSession;

import com.im.carsale.utils.DB;

/**
 * Servlet implementation class CarAddAction
 */
@WebServlet("/car_add_action")
public class CarAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String title=request.getParameter("title");
		String brandId=request.getParameter("brand-id");
		String modelId=request.getParameter("model-id");
		String fuelId=request.getParameter("fuel-id");
		String description=request.getParameter("description");
		String milege=request.getParameter("milage");
		String year=request.getParameter("year");
		String price=request.getParameter("price");
		String condition=request.getParameter("condition");
		Double dPrice=Double.parseDouble(price);
		int iMilage=Integer.parseInt(milege);
		int iYear=Integer.parseInt(year);
		int iModelId=Integer.parseInt(modelId);
		int iFuelId=Integer.parseInt(fuelId);
		String photo=request.getParameter("photo");
		out.println(iModelId);
		HttpSession session=request.getSession();
		String user_id=session.getAttribute("ID").toString();
		int user=Integer.parseInt(user_id);
		//String milege=request.getParameter("milage");
		String errors="";
		if(title.length()<2)
		{
			errors+="name must contain at leat 2 characters<br>";
		}
		if(brandId.equals("0"))
		{
			errors+="brand must be select<br>";
		}
		if(modelId.equals("0"))
		{
			errors+="model must be select<br>";
		}
		if(fuelId.equals("0"))
		{
			errors+="fuel must be select<br>";
		}
		if(!errors.equals(""))
		{
			response.sendRedirect("car/add.jsp?msg="+errors);
			
		}
		else
		{
			try {			
				Connection con=	DB.getConnection();
				String query="Insert into car (title,milage,year,price,`condition`,description,photo,sold,view_count,imp_count,model_id,fuel_type_id,user_id) values(?,?,?,?,?,?,?,1,1,2,?,?,?)";
				PreparedStatement ps=((java.sql.Connection) con).prepareStatement(query);
				ps.setString(1,title);
				ps.setInt(2,iMilage);
				ps.setInt(3,iYear);
				ps.setDouble(4,dPrice );
				ps.setString(5,condition);
				ps.setString(6,description);
				ps.setString(7,photo);
				ps.setInt(8,iModelId);
				ps.setInt(9,iFuelId);
				ps.setInt(10, user);
				
				ps.executeUpdate();
				response.sendRedirect("car/list.jsp?msg=Success"); 
			     
				
			} catch (Exception e) {
				e.printStackTrace();
				//out.print("Registration Failed");
			response.sendError(201, "Error:"+e.getMessage());;
			}
		}
	}

}
