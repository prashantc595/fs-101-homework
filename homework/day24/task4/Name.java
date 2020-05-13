package com.xebia.day24.task4;

public class Name {

	public int integerRepresentation(String name) {
		int sum = 0;
		name = "xebia";
		for (int i = 0; i < name.length(); i++) {
			char character = name.charAt(i);
			int ascii = character;
			sum = sum + ascii;
		}
		return sum;
	}
}
