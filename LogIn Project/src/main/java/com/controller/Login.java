package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userN=request.getParameter("usrname");
		String pass=request.getParameter("psw");
		
		Cookie ck1=new Cookie("uname",userN);
		Cookie ck2=new Cookie("ps",pass);
		
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		
		response.sendRedirect("Profile");
		
		
		
		
	}

}
