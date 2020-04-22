package com.xebia.fs101.day10.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.xebia.fs101.day10.Book;
import com.xebia.fs101.day10.Langauge;

public class BookTest {

	@Test
	void shouldCreateBookUsingTitle() {
		Book book = new Book.Builder("Effective Java").build();
		assertEquals("Effective Java", book.getTitle());
	}

	@Test
	void shouldCreateBookUsingTitleAndAuthorAndLanguage() {
		Book book = new Book.Builder("Effective Java").withAuthor("Jousha").withLanguage(Langauge.English).build();
		assertEquals(Langauge.English, book.getLangugue());
		assertEquals("Jousha", book.getAuthor());
		assertEquals("Effective Java", book.getTitle());
	}

}