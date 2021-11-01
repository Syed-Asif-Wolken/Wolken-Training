package com.wolken.soda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pepper extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String word = req.getParameter("pepper");
		resp.setContentType("text/html");  
		if(!word.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("DrPepper.html");
			rs.include(req,resp);
		}
	}	
}
