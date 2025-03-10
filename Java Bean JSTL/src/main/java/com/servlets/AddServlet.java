package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
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
		List<Student> st = Arrays.asList(new Student(1, "alex"), new Student(2, "ali"), new Student(3, "mark"));
		req.setAttribute("students", st);
		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		rd.forward(req, res);
    }
}
