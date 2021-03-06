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

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		UserDTO dto = new UserDTO();
		PrintWriter writer = resp.getWriter();
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String cnfpassword = req.getParameter("cnfpassword");
		String contact = req.getParameter("contact");
		String dob = req.getParameter("dob");
		String signup = req.getParameter("signup");
		
		if(!signup.isEmpty()) {
			dto.setUsername(fname+" "+lname);
			dto.setDob(dob);
			dto.setEmail(email);
			dto.setContactNumber(Long.parseLong(contact));
			dto.setPassword(password);
			dto.setCnfPassword(cnfpassword);
		}
		
		RegistrationService service=new RegistrationServiceImpl();
		String out = service.validateAndSave(dto);
		
		if(out.contains("Successfully")) {
			RequestDispatcher rs = req.getRequestDispatcher("signup.html");
			writer.println("<div class = 'alert alert-success' role = 'alert'><h5>"+out+"<h5></div>");
			rs.include(req, resp);
		}
		
		else {
			RequestDispatcher rs = req.getRequestDispatcher("signup.html");
			writer.println("<div class = 'alert alert-danger' role = 'alert'><h5>"+out+"<h5></div>");
			rs.include(req, resp);
		}
		
		writer.close();
	}	
}
