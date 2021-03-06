package com.todos.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delete-todo.do")
public class DeleteTodoServlet extends HttpServlet {

private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		todoService.deleteTodo(new Todo(req.getParameter("todo")));
		resp.sendRedirect("/list-todo.do");
	}

}
