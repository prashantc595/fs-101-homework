package com.xebia.day24.task2;

public class Application implements Sender {

	@Override
	public String print(String statement) {
		System.out.println(statement);
		return statement;
	}

}
