package com.todos.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/todo.do")
public class TodoServlet extends HttpServlet {

private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("todos", todoService.retrieveTodos());
		req.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newTodo = req.getParameter("todo");
		todoService.addTodo(new Todo(newTodo));
		
		resp.sendRedirect("/todo.do");
	}

}
