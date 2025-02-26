package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
     // doGet Method
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	int x = Integer.parseInt(req.getParameter("num1"));
    	int y = Integer.parseInt(req.getParameter("num2"));
    	int z = x+y;
    	
    	PrintWriter out = res.getWriter();
    	out.println("<html><body bgcolor='cyan'>");
		out.println("Result add is "+z);
		out.print("</body></html>");
		
    }
}
