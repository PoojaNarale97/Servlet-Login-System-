package com.controller;

import java.io.IOException;

//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LogOut")
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LogOut() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		
		
		Cookie[] ck=request.getCookies();
		
		ck[0].setMaxAge(0);
		ck[1].setMaxAge(0);
		
		response.addCookie(ck[0]);
		response.addCookie(ck[1]);
		response.sendRedirect("index.html");
		
		
		
		
	
	}


	

}
