package com.wolken.cars;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AudiServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<link href='./css/style.css' rel = 'stylesheet' />"
				+ "<title>Audi</title>"
				+ "</head>"
				+ "<body class='as'>"
				+ "<h1 style='text-align: center;'>Audi</h1>"
				+ "<h4 style='text-align: center;'>2012 Audi F12 e Performance prototype Price: $2 million</h4>"
				+ "</body>"
				+ "</html>");
		writer.close();
	}	
}
