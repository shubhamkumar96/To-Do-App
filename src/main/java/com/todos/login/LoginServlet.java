package com.todos.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todos.todo.TodoService;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	private UserValidationService userValidationService = new UserValidationService();
	private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if(isUserValid) {
			req.getSession().setAttribute("name", name);
			resp.sendRedirect("/list-todo.do");
		} else {
			req.setAttribute("errorMessage", "Invalid Credentials!");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
		}
		
	}
	

}
