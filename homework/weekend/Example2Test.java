package com.xebia.weekend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Example2Test {

	Example2 ex2 = new Example2();

	@Test
	public void return_empty_array_when_input_array_isEmpty_with_number_is_zero() {

		int[] arr = {};

		int[] output = ex2.result(arr, 0);

		assertThat(output).isEmpty();

	}

	@Test
	public void return_empty_array_when_input_array_size_is_lower_than_number() {

		int[] arr = { 1, 2, 3 };

		int[] output = ex2.result(arr, 4);

		assertThat("Invalid args");

	}

	@Test
	public void return_empty_array_when_input_array_size_is_valid_and_number_is_also_valid() {

		int[] arr = { 1, 2, 3 };

		int[] output = ex2.result(arr, 2);

		assertThat(output).hasSize(3).contains(output);

	}

}
