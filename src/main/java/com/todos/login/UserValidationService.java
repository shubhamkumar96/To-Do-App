package com.todos.login;

public class UserValidationService {
	public boolean isUserValid(String user, String password) {
		if(user.equalsIgnoreCase("shubham") && password.equals("pass")) {
			return true;
		}
		return false;
	}
}
