package com.xebia.weekend5.task1;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class FormatterTest {

	@Test
	public void shouldReturnDateInValidFormat() {
		Formatter formatter = new Formatter();
		String expected = formatter.formatDate();
		String actual = "11-May-2020";
		assertEquals(actual, expected);
	}
}
