package com.xebia.weekend;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Example1Test {

	Example1 ex = new Example1();

	@Test
	public void when_start_and_end_is_zero() {
		int start = 0;
		int end = 0;

		ex.result(0, 0);

		assertThat("Invalid Args");
	}

	@Test
	public void when_start_and_end_are_equal_and_non_zero() {
		int start = 30;
		int end = 30;

		ex.result(30, 30);

		assertThat("Invalid Args");
	}

	@Test
	public void when_start_and_end_are_valid_and_non_zero() {
		int start = 1;
		int end = 40;

		ex.result(1, 40);

		assertThat("Passed");
	}

}
