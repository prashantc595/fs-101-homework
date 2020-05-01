package com.mk.xebia.solid.srp;

import java.util.HashMap;
import java.util.Map;

public class Login implements User {

	private String email;
	private String password;

	public String perform(String email, String password) {
		Map<String, String> validUsers = new HashMap();
		validUsers.put(email.toUpperCase(), password);
		//validUsers.put("admin".toUpperCase(),"@dm1n");
		//validUsers.put("user".toUpperCase(),"p@$$w0rd");

		if (validUsers.containsKey(email.toUpperCase())) {
			if (validUsers.get(email).equals(password)) {
				return "Congratulations " + email + "! You have successfully logged in.";
			} else {
				return "Are you sure you have provided correct password?";
			}
		} else {
			return "Are you sure you have provided correct username?";
		}

	}
}
