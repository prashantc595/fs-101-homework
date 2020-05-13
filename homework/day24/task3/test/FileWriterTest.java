package com.xebia.day24.task3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.xebia.day24.task3.FileWriter;

public class FileWriterTest {

	@Test
	public void shouldReturnValidTextWhenWritingToFile() {
		FileWriter fileWriter = new FileWriter();
		String actual = "Successfully wrote to the File!";
		String expected = fileWriter.getFile().writeFile(actual);
		assertEquals(expected, actual);
	}
}
