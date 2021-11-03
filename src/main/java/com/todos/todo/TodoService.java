package com.todos.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Learn Servlets and JSP"));
		todos.add(new Todo("Learn Spring"));
		todos.add(new Todo("Learn Spring Rest & MVC"));
		todos.add(new Todo("Learn Spring Boot"));
	}
	
	public List<Todo> retrieveTodos() {
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
}
