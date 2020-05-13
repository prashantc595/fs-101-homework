package com.xebia.day24.task2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.xebia.day24.task2.Client;

public class ClientTest {

	@Test
	public void shouldReturnValidString() {
		Client client = new Client();
		String actual = "Hi! Welcome to World";
		String expected = client.getSender().print("Hi! Welcome to World");
		assertEquals(expected, actual);

	}

}
