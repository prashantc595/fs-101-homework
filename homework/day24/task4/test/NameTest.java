package com.xebia.day24.task4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.xebia.day24.task4.Name;

public class NameTest {

	@Test
	public void shouldReturnIntegerForStringArgument() {
		Name name = new Name();
		String text = "Prashant";
		int actual = 833;
		int expected = name.integerRepresentation(text);
		assertEquals(expected, actual);
	}
}
