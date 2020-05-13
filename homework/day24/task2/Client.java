package com.xebia.day24.task2;

public class Client {

	Sender sender = (String statement) -> {
		return statement;
	};

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

}
