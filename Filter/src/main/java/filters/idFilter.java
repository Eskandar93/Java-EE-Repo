package filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/add")
public class idFilter extends HttpFilter implements Filter {
       

	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		System.out.println("In Filter");
		HttpServletRequest req = (HttpServletRequest) request;
		int id = Integer.parseInt(request.getParameter("id"));
		if(id > 1)
			chain.doFilter(request, response);
		else 
			out.print("Invalid Input");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
