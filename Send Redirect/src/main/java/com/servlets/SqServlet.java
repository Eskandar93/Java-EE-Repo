package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// fetch the sharing data by Session 
		int z = Integer.parseInt(req.getParameter("z"));
		z *=z;
		
		PrintWriter out = res.getWriter();
		out.println("Result Sq is "+z);
		System.out.println("sq Called");
	}
}
