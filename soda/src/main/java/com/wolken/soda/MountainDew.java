package com.wolken.soda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MountainDew extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String word = req.getParameter("dew");
		resp.setContentType("text/html");  
		if(!word.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("MountainDew.html");
			rs.include(req,resp);
		}
	}	
}
