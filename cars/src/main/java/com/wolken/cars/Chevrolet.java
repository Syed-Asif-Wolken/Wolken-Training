package com.wolken.cars;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Chevrolet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<link href='./css/style.css' rel = 'stylesheet' />"
				+ "<title>Chevrolet</title>"
				+ "</head>"
				+ "<body class='Chevrolet'>"
				+ "<h1 style='text-align: center;'>Chevrolet</h1>"
				+ "<h4 style='text-align: center;'>Corvette ZR1 Price: $120,900</h4>"
				+ "</body>"
				+ "</html>");
		writer.close();
	}	
}
