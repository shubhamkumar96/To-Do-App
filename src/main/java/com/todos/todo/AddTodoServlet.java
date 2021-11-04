package com.todos.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add-todo.do")
public class AddTodoServlet extends HttpServlet {

private TodoService todoService = new TodoService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newTodo = req.getParameter("todo");
		todoService.addTodo(new Todo(newTodo));
		
		resp.sendRedirect("/list-todo.do");
	}

}
