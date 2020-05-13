package com.xebia.day24.task4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.xebia.day24.task4.Box;

public class BoxTest {

	@Test
	public void shouldReturnIntegerWhenObjectIsPassed() {
		Box myBox = new Box(10, 10, 10);
		int actual = 1000;
		int expected = myBox.volume();
		assertEquals(expected, actual);

	}

}
