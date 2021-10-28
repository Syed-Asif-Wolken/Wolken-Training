package com.wolken.cars;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dodge extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>"
				+ "<head>"
				+ "<link href='./css/style.css' rel = 'stylesheet' />"
				+ "<title>Dodge</title>"
				+ "</head>"
				+ "<body class='Dodge'>"
				+ "<h1 style='text-align: center;'>Dodge</h1>"
				+ "<h4 style='text-align: center;'>Dodge Viper Concept VM-02 1989 Price: $3 million</h4>"
				+ "</body>"
				+ "</html>");
		writer.close();
	}	
}
