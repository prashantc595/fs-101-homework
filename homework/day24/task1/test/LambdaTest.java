package com.xebia.day24.task1.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import com.xebia.day24.task1.Lambda;
import com.xebia.fs101.day10.BookShelfException;

public class LambdaTest {

	@Test
	public void shouldReturnValidNumber() {
		Lambda lambda = new Lambda();
		String name = "Prashant";
		int number = 17;

		int expected = 850;
		int actual = lambda.getAdd().addition(name, number);
		assertEquals(expected, actual);

	}

	@Test
	public void shouldReturnValidNumberIfNumberIsZero() {
		Lambda lambda = new Lambda();
		String name = "Prashant";
		int number = 0;

		int expected = 833;
		int actual = lambda.getAdd().addition(name, number);
		assertEquals(expected, actual);

	}

	@Test
	public void shouldThowException() {
		Lambda lambda = new Lambda();
		String name = null;
		int number = 17;
		assertThrows(NullPointerException.class, () -> {
			lambda.getAdd().addition(name, number);
		});

	}

}
