package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
     // doGet Method
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	int x = Integer.parseInt(req.getParameter("num1"));
    	int y = Integer.parseInt(req.getParameter("num2"));
    	int z = x+y;
    	
    	// Session Management
    	req.setAttribute("z", z);
    	
    	// Request Dispatcher to send request directly from dd servlet to sq servlet
    	RequestDispatcher rd = req.getRequestDispatcher("sq");
    	rd.forward(req, res);
    }
    
    // doPost Method
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	int x = Integer.parseInt(req.getParameter("num1"));
    	int y = Integer.parseInt(req.getParameter("num2"));
    	int z = x+y;
    	
    	PrintWriter out = res.getWriter();
    	out.println("result is "+z);
    }
}
