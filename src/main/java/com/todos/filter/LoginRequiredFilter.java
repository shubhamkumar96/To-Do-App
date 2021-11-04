package com.todos.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns={"*.do"})
public class LoginRequiredFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		if(httpServletRequest.getSession().getAttribute("name") != null) {
			chain.doFilter(request, response);
		} else {
//			httpServletRequest.getRequestDispatcher("/login-do").forward(request, response);
			httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}

	@Override
	public void destroy() {
	}
	
}
