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

public class GetDataServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		UserDTO dto = new UserDTO();
		RegistrationService service=new RegistrationServiceImpl();
		PrintWriter writer = resp.getWriter();
		String email = req.getParameter("email");
		String submit = req.getParameter("login");
		if(!email.isEmpty())
			dto = service.getByMail(email);
		if(!submit.isEmpty()) {
			String id = String.valueOf(dto.getId());
			String uname=dto.getUsername();
			String dob=dto.getDob();
			String emailId=dto.getEmail();
			String contact=String.valueOf(dto.getContactNumber());
			String pwd=dto.getPassword();
			
			RequestDispatcher rs = req.getRequestDispatcher("login.html");
			writer.println("<div class = 'alert alert-success' role = 'alert'><h5>"
					+"ID: "+ id+"<br/>"
					+ "UserName: " + uname+"<br/>"
					+ "Date of Birth: "+dob+"<br/>"
					+ "Email Id: "+emailId+"<br/>"
					+ "Contact Number: "+contact+"<br/>"
					+ "Password: "+pwd+"<br/>"
					+ "<h5></div>");
			rs.include(req, resp);
		}
		else {
			RequestDispatcher rs = req.getRequestDispatcher("login.html");
			writer.println("<div class = 'alert alert-danger' role = 'alert'><h5>Error<h5></div>");
			rs.include(req, resp);
		}
		
		writer.close();
	}	
}

