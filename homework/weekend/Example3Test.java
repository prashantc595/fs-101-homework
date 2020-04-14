package com.xebia.weekend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Example3Test {

	Example3 ex3 = new Example3();

	@Test
	public void return_empty_string_when_input_string_is_empty() {

		String s = "";

		ex3.result(s);

		assertThat("Empty String");

	}

	@Test
	public void return_valid_string_when_input_string_is_valid() {

		String s = "prashant";

		ex3.result(s);

		assertThat("Valid String");

	}

}
