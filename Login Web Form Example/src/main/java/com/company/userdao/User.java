package com.company.userdao;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

public class User {

	private static String username;
	private static String password;
	private static String email;
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		User.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		User.password = password;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		User.email = email;
	}
}
