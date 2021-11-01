package com.wolken.facebook;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.facebook.dto.UserDTO;
import com.wolken.facebook.services.RegistrationService;
import com.wolken.facebook.services.RegistrationServiceImpl;

public class DeleteServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		UserDTO dto = new UserDTO();
		
		PrintWriter writer = resp.getWriter();
		String email = req.getParameter("email");
		String submit = req.getParameter("update");
		
		RegistrationService service=new RegistrationServiceImpl();
		String out = service.deleteByMail(email);
		if(out.contains("Successfully")) {
			RequestDispatcher rs = req.getRequestDispatcher("delete.html");
			writer.println("<div class = 'alert alert-success' role = 'alert'><h5>"
					+ out
					+ "<h5></div>");
			rs.include(req, resp);
		}
		else {
			RequestDispatcher rs = req.getRequestDispatcher("delete.html");
			writer.println("<div class = 'alert alert-danger' role = 'alert'><h5>"+out+"<h5></div>");
			rs.include(req, resp);
		}
		
		writer.close();
	}	
}
