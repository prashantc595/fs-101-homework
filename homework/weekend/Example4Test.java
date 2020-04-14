package com.xebia.weekend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Example4Test {

	Example4 ex4 = new Example4();

	@Test
	public void return_empty_array_when_input_array_isEmpty_with_number_is_zero() {

		String[] arr = {};

		String[] output = ex4.result(arr, 0);

		assertThat(output).isEmpty();

	}

	@Test
	public void return_empty_array_when_input_array_isnonEmpty_with_number_is_zero() {

		String[] arr = { "a", "b", "c" };

		String[] output = ex4.result(arr, 3);

		assertThat(output).hasSize(3).contains(output);

	}

}
