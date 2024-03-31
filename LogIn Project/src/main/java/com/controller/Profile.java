package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Profile")
public class Profile extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Profile() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie ck[] = request.getCookies();

        if (ck == null) {
            response.sendRedirect("index.html");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.print("<html>");
            out.print("<head>");
            out.print("<title>User Profile</title>");
            out.print("<link rel='stylesheet' type='text/css' href='CSS/logout.css'>"); // Linking CSS file
            out.print("</head>");
            out.print("<body>");
            out.print("<div class=\"profile-container\">");
            out.print("<h3>UserName: " + ck[0].getValue() + "</h3>");
            out.print("<h3>Password: " + ck[1].getValue() + "</h3>");
            out.print("<form action=\"LogOut\">");
            out.print("<input type='submit' value='LogOut' class='logout-btn'>");
            out.print("</form>");
            out.print("</div>");
            out.print("</body>");
            out.print("</html>");
        }
    }
}
