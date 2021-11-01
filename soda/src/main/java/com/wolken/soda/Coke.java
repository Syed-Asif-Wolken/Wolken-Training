package com.wolken.soda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Coke extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String coke = req.getParameter("coke");
		resp.setContentType("text/html");   
		if(!coke.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("Coca-Cola.html");
			rs.include(req,resp);
		}
	}	
}
