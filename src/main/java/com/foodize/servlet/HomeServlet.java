package com.foodize.servlet;

import java.io.IOException;
import java.util.List;

import com.foodize.daoimplementation.RestaurentDAOImpl;
import com.foodize.model.Restaurent;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RestaurentDAOImpl restaurentDAO = new RestaurentDAOImpl();
		
		List<Restaurent> allRestaurents = restaurentDAO.getAllRestaurents();
		
		request.setAttribute("restaurents" , allRestaurents);
		
		request.getRequestDispatcher("home.jsp").forward(request, response);
		
		
		
		
	}

}
