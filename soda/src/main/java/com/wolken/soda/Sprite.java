package com.wolken.soda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sprite extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String word = req.getParameter("sprite");
		resp.setContentType("text/html");  
		if(!word.isEmpty()) {
			RequestDispatcher rs = req.getRequestDispatcher("Sprite.html");
			rs.include(req,resp);
		}
	}	
}
