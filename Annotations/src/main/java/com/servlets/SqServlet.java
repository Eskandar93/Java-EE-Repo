package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int z=0;
		Cookie cookies[] =  req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("z")) {
				z = Integer.parseInt(c.getValue());
			}
		}
		 
		z *=z;
		PrintWriter out = res.getWriter();
		out.println("Result Sq is "+z);
	}
}
