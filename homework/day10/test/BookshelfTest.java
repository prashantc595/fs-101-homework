package com.xebia.fs101.day10.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.Test;

import com.xebia.fs101.day10.Book;
import com.xebia.fs101.day10.BookShelfException;

import com.xebia.fs101.day10.Bookshelf;
import com.xebia.fs101.day10.SocialPlatform;
import com.xebia.fs101.day10.SupportedSocialPlatforms;

public class BookshelfTest {

	@Test
	public void shoudlCreateEmptyBookshelf() {
		Bookshelf bookshelf = new Bookshelf();
		assertEquals(0, bookshelf.size());
	}

	@Test
	public void shouldAddBooksToshelf() {
		Book book1 = new Book.Builder("Effective Java").build();
		Book book2 = new Book.Builder("Concurancy in practice").build();
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.add(book1);
		bookshelf.add(book2);
		assertEquals(2, bookshelf.size());
	}

	@Test
	public void shouldNotAddBookTwiceToShelf() {
		Book book1 = new Book.Builder("Effective Java").build();
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.add(book1);

		assertThrows(BookShelfException.class, () -> {
			bookshelf.add(book1);
		});
	}

	@Test
	public void shouldCheckIfBooksExists() {
		Book book1 = new Book.Builder("Effective Java").build();
		Book book2 = new Book.Builder("Concurancy in practice").build();
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.add(book1);
		bookshelf.add(book2);

		assertTrue(bookshelf.exists(new Book.Builder("Effective Java").build()));
		assertFalse(bookshelf.exists(new Book.Builder("Java in Action").build()));
	}

	@Test
	public void shouldCreatePrivateboofShelfType() {
		Bookshelf bookshelf = new Bookshelf();
		assertFalse(bookshelf.isPublic());
	}

	@Test
	public void shouldChangePrivateBookShelfTypeToPublic() {
		Bookshelf bookshelf = new Bookshelf();
		assertFalse(bookshelf.isPublic());
		bookshelf.makePublic();
		assertTrue(bookshelf.isPublic());

	}

	@Test
	public void urlShouldBeSharedIfBookshelfIsPublic() throws IOException {
		Bookshelf bookshelf = new Bookshelf();
		String url = "https://bookshelf/prashantc595";
		assertTrue(bookshelf.isPublic());
		assertEquals(bookshelf.selectPlatform(SupportedSocialPlatforms.FaceBook, url).share(url),"https://www.facebook.com/sharer/sharer.php?u=bookshelf/prashantc595");
		assertEquals(bookshelf.selectPlatform(SupportedSocialPlatforms.Twitter, url).share(url),"https://www.twitter.com/sharer/sharer.php?u=\bookshelf/prashantc595");
		assertEquals(bookshelf.selectPlatform(SupportedSocialPlatforms.LinkedIn, url).share(url),"https://www.linkedIn.com/sharer/sharer.php?u=\bookshelf/prashantc595");
		
		

	}

}