package com.xebia.day24.task4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.xebia.day24.task4.Student;

public class StudentTest {

	@Test
	public void shouldReturnStringRepresentation() {
		Student student = new Student(101, "Prashant", "Faridabad");
		String expected = "Student [rollno=101, name=Prashant, city=Faridabad]";
		String actual = student.representation(student);
		assertEquals(expected, actual);

	}
}
