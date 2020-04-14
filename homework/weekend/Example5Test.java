package com.xebia.weekend;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class Example5Test {

	Example5 ex5 = new Example5();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void return_empty_array_when_input_array_isEmpty() {

		String[] arr = {};

		List l = ex5.result(arr);

		assertThat(l).isEmpty();

	}

	@SuppressWarnings("unchecked")
	@Test
	public void return_empty_array_when_input_array_isnonEmpty_with_number_is_zero() {

		String[] arr = { "a", "a", "a", "b", "a", "c", "c", "c" };

		@SuppressWarnings("rawtypes")
		List l = ex5.result(arr);

		assertThat(l).hasSize(4).contains(l);

	}

}
