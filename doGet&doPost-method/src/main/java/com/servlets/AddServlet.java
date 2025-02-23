package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	// get and post method in one method
     public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		int z = x+y;
		
		//res.getWriter() Returns a PrintWriter object that can send character text to the client.
		PrintWriter out = res.getWriter();
		out.println("result is "+z);
	}
    
     // doGet Method
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	int x = Integer.parseInt(req.getParameter("num1"));
    	int y = Integer.parseInt(req.getParameter("num2"));
    	int z = x+y;
    	
    	PrintWriter out = res.getWriter();
    	out.println("result is "+z);
    }
    
    // doPost Method
    public void doPet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	int x = Integer.parseInt(req.getParameter("num1"));
    	int y = Integer.parseInt(req.getParameter("num2"));
    	int z = x+y;
    	
    	PrintWriter out = res.getWriter();
    	out.println("result is "+z);
    }
}
