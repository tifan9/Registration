package com.auca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	// Declare Variables
	private static final String name="admin";
	private static final String pass="admin";
	@Override
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		try {
			String User= req.getParameter("username");
			String pswd= req.getParameter("password");
			
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			
			
			// check if the username and password matches
			
			if(User.equals(name) && pswd.equals(pass)) {
				res.sendRedirect("welcome.html");
				
			}else {
				res.sendRedirect("forgotpass.html");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
